package com.minitest.test.board.controller;

import com.minitest.test.board.entity.BoardVO;
import com.minitest.test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor // 생성자 주입을 위한 어노테이션
@RequestMapping("/board")
@Slf4j
public class BoardController {
    private final BoardService boardService;

    @GetMapping("save")
    public String save(){
        return "board/save";
    }

    @PostMapping("save")
    public String save(@ModelAttribute BoardVO boardVO){ // ModelAttribute는 생략 가능
        log.info("BoardVO = " + boardVO);
        boardService.save(boardVO);
        return "index";
    }
}

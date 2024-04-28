package com.minitest.test.board.controller;

import com.minitest.test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor // 생성자 주입을 위한 어노테이션
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("save")
    public String save(){
        return "board/save";
    }
}

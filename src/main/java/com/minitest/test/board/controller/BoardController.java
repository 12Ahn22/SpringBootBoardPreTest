package com.minitest.test.board.controller;

import com.minitest.test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor // 생성자 주입을 위한 어노테이션
public class BoardController {
    private final BoardService boardService;
}

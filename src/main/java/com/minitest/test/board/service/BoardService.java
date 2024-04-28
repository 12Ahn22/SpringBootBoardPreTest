package com.minitest.test.board.service;

import com.minitest.test.board.entity.BoardVO;
import com.minitest.test.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void save(BoardVO boardVO) {
        boardMapper.save(boardVO);
    }
}

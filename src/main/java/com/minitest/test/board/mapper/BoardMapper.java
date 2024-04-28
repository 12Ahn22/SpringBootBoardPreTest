package com.minitest.test.board.mapper;

import com.minitest.test.board.entity.BoardVO;
import org.apache.ibatis.annotations.Mapper;

// Mapper(MyBatis) = Repository(JPA)
@Mapper
public interface BoardMapper {
    // 이렇게 사용하는 방법도 존재한다. 하지만 수업에서는 interface로 하는 방법을 사용함
    // private final SqlSessionTemplate sql;
//    public void save(BoardVO boardVO) {
//        // sql.insert("Board.save", boardVO);
//    }

    int save(BoardVO boardVO);
}

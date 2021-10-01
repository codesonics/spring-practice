package kr.codesonics.oop.service;

import kr.codesonics.oop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sortService = new SortService(new JavaSort<Integer>());
    @Test
    void doSort() {
        //Given
        //When
        List<Integer> actual= sortService.doSort(List.of(1,2,3,4));
        //Then
        assertEquals(List.of(1,2,3,4), actual);
    }
}
package kr.codesonics.oop.service;

import kr.codesonics.oop.logic.JavaSort;
import kr.codesonics.oop.logic.Sort;

import java.util.List;

public class SortService {
    private final Sort<Integer> sort;

    public SortService(Sort<Integer> sort) {
        this.sort = sort;
    }

    public List<Integer> doSort(List<Integer> list) {

        return sort.sort(list);
    }
}

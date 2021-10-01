package kr.codesonics.oop;

import kr.codesonics.oop.config.Config;
import kr.codesonics.oop.logic.BubbleSort;
import kr.codesonics.oop.logic.JavaSort;
import kr.codesonics.oop.logic.Sort;
import kr.codesonics.oop.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);
        List arr = Arrays.asList(args);
        System.out.println("[result] : " + sortService.doSort(arr));
    }
}

package kr.codesonics.oop;

import org.junit.jupiter.api.Test;

import java.awt.image.VolatileImage;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        //Given
        String[] args = {"3", "2", "1"};
        // When & Then
        Main.main(args);
    }
}
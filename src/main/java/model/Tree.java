package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Tree <T> {
    final T value;
    Tree<T> left;
    Tree<T> right;


}

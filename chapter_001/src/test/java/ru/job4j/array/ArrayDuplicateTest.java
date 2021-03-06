package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] resultArray = arrayDuplicate.remove(new String[]{"Катя", "Маша", "Лена", "Катя", "Лена"});
        String[] expectArray = new String[]{"Катя", "Маша", "Лена"};
        assertThat(resultArray,arrayContainingInAnyOrder(expectArray));
    }
}
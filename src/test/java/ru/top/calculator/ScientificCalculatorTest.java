package ru.top.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.top.calculator.Calculator;
import ru.top.calculator.ScientificCalculator;

@ExtendWith(MockitoExtension.class) // Junit использовать чтобы и обработать
public class ScientificCalculatorTest {

    @Mock
    private Calculator calculator;

    @InjectMocks
    private ScientificCalculator scientificCalculator;

    @Test
    public void Test(){
        Mockito.when(calculator.sum(Mockito.any(Integer.class), Mockito.any(Integer.class)))
                .thenReturn(5)
                .thenReturn(6);

        int sum  = scientificCalculator.sum(2,3);
        int sum2  = scientificCalculator.sum(3,3);

        Assertions.assertEquals(5,sum);
        Assertions.assertEquals(6,sum2);
    }


}

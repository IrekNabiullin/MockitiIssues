/*
Чтобы создать Mockito объект можно использовать либо аннотацию @Mock, либо метод mock.
В двух разных классах (Test_Mockito1, Test_Mockito2) разными способами создаются объекты mcalc
для имитации интерфейса калькулятора ICalculator.
 */

import org.mockito.Mock;
import org.mockito.Mockito;
public class Test_Mockito2
{
    ICalculator mcalc = Mockito.mock(ICalculator.class);
}

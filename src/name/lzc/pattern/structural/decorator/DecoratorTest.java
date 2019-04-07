package name.lzc.pattern.structural.decorator;

import org.junit.Test;

/**
 * Description:   
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-02 15:33:52  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-02   lzc         1.0         1.0 Version  
 */

public class DecoratorTest {

	@Test
	public void test() {
		Phone phone = new PhoneDecorator(new CellPhone());
		phone.call();
	}
}

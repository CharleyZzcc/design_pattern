package name.lzc.pattern.behavior.strategy;


/**
 * Description: 策略模式 —— 具体实现B  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-05 15:27:10  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-05   lzc         1.0         1.0 Version  
 */

public class ConcreteStrategyB implements Strategy {

	@Override
	public void operation() {
		System.out.println("operation of ConcreteStrategyB");
	}

}

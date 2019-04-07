package name.lzc.pattern.behavior.visitor;


/**
 * Description: 访问者模式  
 * @author:     lzc  
 * @version:    1.0  
 * @date:       2019-04-06 15:47:54  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-06   lzc         1.0         1.0 Version  
 */

public interface Visitor {

	void visit(Visible visible);
}

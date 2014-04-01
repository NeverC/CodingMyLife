/**  
 * @Title: ValueEvent.java
 * @Package never.disruptor.demos
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 1, 2014 9:10:17 PM
 * @Description: TODO
 */
package never.disruptor.demos;

import com.lmax.disruptor.EventFactory;

public final class ValueEvent {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public final static EventFactory<ValueEvent> EVENT_FACTORY = new EventFactory<ValueEvent>() {
		public ValueEvent newInstance() {
			return new ValueEvent();
		}
	};
}

package work.wanghao.rxbus;

import work.wanghao.library.RxBusEvent;

/**
 * Create on: 2016-07-23
 * Author: wangh
 * Summary: TODO
 */
public class EventMsg extends RxBusEvent {

  public String mString;

  public EventMsg(String string) {
    mString = string;
  }
}

/**
 * 
 */
package ch.mischkov.job_application_auto.model;

import ch.mischkov.job_application_auto.ctrl.IntModelCtrl;

/**
 * @author Mischkov
 *
 */
public class Model implements IntCtrlModel{
   
   private IntModelCtrl refCtrl;
   private String helloMessage = "Hello World !";
   
   
   public void setRefCtrl(IntModelCtrl refCtrl) {
      this.refCtrl = refCtrl;
   }
   
   @Override
   public String getHello() {
      return this.helloMessage;
   }
   
}

/**
 * 
 */
package ch.mischkov.job_application_auto.view;

import ch.mischkov.job_application_auto.ctrl.IntViewCtrl;

/**
 * @author Mischkov
 *
 */
public class View implements IntCtrlView {

   private IntViewCtrl refCtrl;

   public void setRefCtrl(IntViewCtrl refCtrl) {
      this.refCtrl = refCtrl;
   }

   @Override
   public void sayHello (String message) {
      System.out.println(message);
   }
   
}

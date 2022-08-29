/**
 * 
 */
package ch.mischkov.job_application_auto.ctrl;

import ch.mischkov.job_application_auto.model.IntCtrlModel;
import ch.mischkov.job_application_auto.view.IntCtrlView;

/**
 * @author Mischkov
 *
 */

public class Ctrl implements IntModelCtrl,IntViewCtrl{
   
   private IntCtrlModel refModel;
   private IntCtrlView refView;

   public void init() {
      refView.sayHello(refModel.getHello());
   }
   
   public void setRefModel(IntCtrlModel refModel) {
      this.refModel = refModel;
   }
   
   public void setRefView(IntCtrlView refView) {
      this.refView = refView;
   }
   
}

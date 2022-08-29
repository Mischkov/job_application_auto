/**
 * 
 */
package ch.mischkov.job_application_auto;

import ch.mischkov.job_application_auto.ctrl.Ctrl;
import ch.mischkov.job_application_auto.model.Model;
import ch.mischkov.job_application_auto.view.View;

/**
 * @author Mischkov
 *
 */
public class JobApplicationAuto {

   /**
    * @param args
    */
   public static void main(String[] args) {
      Ctrl ctrl = new Ctrl();
      Model model = new Model();
      View view = new View();
      ctrl.setRefModel(model);
      ctrl.setRefView(view);
      model.setRefCtrl(ctrl);
      view.setRefCtrl(ctrl);
      ctrl.init();
   }

}

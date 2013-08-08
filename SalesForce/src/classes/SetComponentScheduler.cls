//SetComponentScheduler m = new SetComponentScheduler();
  //      String sch = '0 0 * 1 * ?n';
    //    system.schedule('set components on sub charges', sch, m);
global class SetComponentScheduler implements Schedulable{
 global void execute(SchedulableContext SC) {
      SetComponentActionCallout act = new SetComponentActionCallout(); 
      act.Execute();
   }
}
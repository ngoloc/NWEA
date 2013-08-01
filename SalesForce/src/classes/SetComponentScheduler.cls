global class SetComponentScheduler implements Schedulable{
 global void execute(SchedulableContext SC) {
      SetComponentActionCallout act = new SetComponentActionCallout(); 
      act.Execute();
   }
}
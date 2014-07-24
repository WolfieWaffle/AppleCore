package squeek.applecore.example;

import squeek.applecore.api.hunger.StarvationEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class StarvationModifier
{

	@SubscribeEvent
	public void allowStarvation(StarvationEvent.AllowStarvation event)
	{
		event.setResult(Result.ALLOW);
	}

	@SubscribeEvent
	public void onStarveTick(StarvationEvent.Tick event)
	{
		event.starveTickPeriod = 60;
	}

	@SubscribeEvent
	public void onStarve(StarvationEvent.Starve event)
	{
		event.starveDamage = 1;
	}

}

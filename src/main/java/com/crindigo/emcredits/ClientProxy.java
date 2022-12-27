package com.crindigo.emcredits;

import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = EMCredits.MOD_ID)
public class ClientProxy extends CommonProxy
{
    @SubscribeEvent
    public static void addInfoText(RenderGameOverlayEvent.Text event)
    {
        String s = "Credit: $1,455.92 ";
        s += TextFormatting.GREEN + "+" + "54.21/s";
        event.getLeft().add(s);
    }
}

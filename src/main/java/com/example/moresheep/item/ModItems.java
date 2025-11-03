package com.example.moresheep.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.rmi.registry.Registry;

public class ModItems  {
    public static final DeferredRegister.Items ITEMS=DeferredRegister.createItems("moresheep");

    public static final DeferredItem<Item> STAR_POINT = ITEMS.register(
      "star_point", () -> new Item(new Item.Properties()));


}

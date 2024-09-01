package cn.ksmcbrigade.les;

import net.fabricmc.api.ClientModInitializer;

public class LegacyCanEditSign implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		System.out.println("Hello Fabric 1.8.9 world!");
	}
}

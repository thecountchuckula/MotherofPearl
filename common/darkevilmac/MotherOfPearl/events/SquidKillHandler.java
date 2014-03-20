package darkevilmac.MotherOfPearl.events;

import tcc.MotherOfPearl.items.ModItems;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class SquidKillHandler {

	@ForgeSubscribe
	public void onSquidKill(LivingDropsEvent event) {
		// algorithm by Pahimar
		if (event.source.getDamageType().equals("player")) {
			EntityPlayer p = (EntityPlayer) event.source.getEntity();

			if (event.entityLiving instanceof EntitySquid) {
				if (event.lootingLevel == 0) {
					int oyster = event.entityLiving.worldObj.rand.nextInt(6);

					if (oyster < 1) {
						event.entityLiving.dropItem(ModItems.oyster.itemID, 1);
					}
				}
				if (event.lootingLevel == 1) {
					int oyster = event.entityLiving.worldObj.rand.nextInt(5);

					if (oyster < 1) {
						event.entityLiving.dropItem(ModItems.oyster.itemID, 1);
					}
				}
				if (event.lootingLevel == 2) {
					int oyster = event.entityLiving.worldObj.rand.nextInt(4);

					if (oyster < 1) {
						event.entityLiving.dropItem(ModItems.oyster.itemID, 1);
					}
				}
				if (event.lootingLevel >= 3) {
					int oyster = event.entityLiving.worldObj.rand.nextInt(3);

					if (oyster < 1) {
						event.entityLiving.dropItem(ModItems.oyster.itemID, 1);
					}
				}
			}
		}

		if (event.source.getSourceOfDamage() instanceof EntityArrow) {
			if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null) {
				if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer) {

					EntityPlayer p = (EntityPlayer) event.source.getEntity();
					if (event.entityLiving instanceof EntitySquid) {
						if (event.lootingLevel == 0) {
							int oyster = event.entityLiving.worldObj.rand
									.nextInt(6);

							if (oyster < 1) {
								event.entityLiving.dropItem(
										ModItems.oyster.itemID, 1);
							}
						}
						if (event.lootingLevel == 1) {
							int oyster = event.entityLiving.worldObj.rand
									.nextInt(5);

							if (oyster < 1) {
								event.entityLiving.dropItem(
										ModItems.oyster.itemID, 1);
							}
						}
						if (event.lootingLevel == 2) {
							int oyster = event.entityLiving.worldObj.rand
									.nextInt(4);

							if (oyster < 1) {
								event.entityLiving.dropItem(
										ModItems.oyster.itemID, 1);
							}
						}
						if (event.lootingLevel >= 3) {
							int oyster = event.entityLiving.worldObj.rand
									.nextInt(3);

							if (oyster < 1) {
								event.entityLiving.dropItem(
										ModItems.oyster.itemID, 1);
							}
						}
					}
				}
			}
		}
	}
}

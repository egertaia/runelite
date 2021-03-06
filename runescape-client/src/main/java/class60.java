import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class60 {
	@ObfuscatedName("n")
	@Export("applet")
	static Applet applet;
	@ObfuscatedName("v")
	static String field454;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1207214855
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;

	static {
		applet = null; // L: 10
		field454 = ""; // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	public static void method967() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 43
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 44
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 45
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 46
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 47
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 48
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 49
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 51
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 52
		}
	} // L: 54

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-291804616"
	)
	static final int method972(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 522
		int var4 = var0 & var2 - 1; // L: 523
		int var5 = var1 / var2; // L: 524
		int var6 = var1 & var2 - 1; // L: 525
		int var7 = class69.method1259(var3, var5); // L: 526
		int var8 = class69.method1259(var3 + 1, var5); // L: 527
		int var9 = class69.method1259(var3, var5 + 1); // L: 528
		int var10 = class69.method1259(var3 + 1, var5 + 1); // L: 529
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 532
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16); // L: 533
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 538
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 539
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 544
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16); // L: 545
		return var15; // L: 547
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lhz;B)I",
		garbageValue = "81"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 11482
		return var1 != null ? var1.integer : var0.flags; // L: 11483 11484
	}
}

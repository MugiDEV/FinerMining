/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
package xyz.apfelmus.cheeto.client.events;

import net.minecraft.client.gui.GuiScreen;
import xyz.apfelmus.cf4m.event.Listener;

public class BackgroundDrawnEvent
extends Listener {
    public GuiScreen gui;

    public BackgroundDrawnEvent(GuiScreen gui) {
        super(Listener.At.HEAD);
        this.gui = gui;
    }
}


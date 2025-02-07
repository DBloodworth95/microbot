package net.runelite.client.plugins.microbot.agility;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ObjectID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.microbot.agility.models.AgilityObstacleModel;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import java.awt.*;
import java.util.ArrayList;

import static net.runelite.api.ObjectID.*;

@PluginDescriptor(
        name = "Micro Agility",
        description = "Microbot ag!lity plugin",
        tags = {"agility", "microbot"},
        enabledByDefault = false
)
@Slf4j
public class MicroAgilityPlugin extends Plugin {
    @Inject
    private MicroAgilityConfig config;
    @Provides
    MicroAgilityConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(MicroAgilityConfig.class);
    }

    @Inject
    private OverlayManager overlayManager;
    @Inject
    private MicroAgilityOverlay agilityOverlay;

    @Inject
    AgilityScript agilityScript;


    @Override
    protected void startUp() throws AWTException {
        if (overlayManager != null) {
            overlayManager.add(agilityOverlay);
        }

        // Draynor
        agilityScript.draynorCourse.add(new AgilityObstacleModel(ROUGH_WALL));
        agilityScript.draynorCourse.add(new AgilityObstacleModel(TIGHTROPE));
        agilityScript.draynorCourse.add(new AgilityObstacleModel(TIGHTROPE_11406));
        agilityScript.draynorCourse.add(new AgilityObstacleModel(NARROW_WALL));
        agilityScript.draynorCourse.add(new AgilityObstacleModel(WALL_11630));
        agilityScript.draynorCourse.add(new AgilityObstacleModel(GAP_11631));
        agilityScript.draynorCourse.add(new AgilityObstacleModel(CRATE_11632));

        // Al Kharid
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(ROUGH_WALL_11633));
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(TIGHTROPE_14398));
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(CABLE));
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(ZIP_LINE_14403));
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(TROPICAL_TREE_14404));
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(ROOF_TOP_BEAMS));
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(TIGHTROPE_14409));
        agilityScript.alkharidCourse.add(new AgilityObstacleModel(GAP_14399));

        // Varrock
        agilityScript.varrockCourse.add(new AgilityObstacleModel(ROUGH_WALL_14412));
        agilityScript.varrockCourse.add(new AgilityObstacleModel(CLOTHES_LINE));
        agilityScript.varrockCourse.add(new AgilityObstacleModel(GAP_14414));
        agilityScript.varrockCourse.add(new AgilityObstacleModel(WALL_14832));
        agilityScript.varrockCourse.add(new AgilityObstacleModel(GAP_14833)); // this obstacle doesn't always work for some reason
        agilityScript.varrockCourse.add(new AgilityObstacleModel(GAP_14834));
        agilityScript.varrockCourse.add(new AgilityObstacleModel(GAP_14835));
        agilityScript.varrockCourse.add(new AgilityObstacleModel(LEDGE_14836));
        agilityScript.varrockCourse.add(new AgilityObstacleModel(EDGE));

        //gnome stronghold
        agilityScript.gnomeStrongholdCourse.add(new AgilityObstacleModel(LOG_BALANCE_23145));
        agilityScript.gnomeStrongholdCourse.add(new AgilityObstacleModel(OBSTACLE_NET_23134));
        agilityScript.gnomeStrongholdCourse.add(new AgilityObstacleModel(TREE_BRANCH_23559));
        agilityScript.gnomeStrongholdCourse.add(new AgilityObstacleModel(BALANCING_ROPE_23557));
        agilityScript.gnomeStrongholdCourse.add(new AgilityObstacleModel(TREE_BRANCH_23560));
        agilityScript.gnomeStrongholdCourse.add(new AgilityObstacleModel(OBSTACLE_NET_23135));
        agilityScript.gnomeStrongholdCourse.add(new AgilityObstacleModel(OBSTACLE_PIPE_23138));


        //canafis
        agilityScript.canafisCourse.add(new AgilityObstacleModel(TALL_TREE_14843));
        agilityScript.canafisCourse.add(new AgilityObstacleModel(GAP_14844));
        agilityScript.canafisCourse.add(new AgilityObstacleModel(GAP_14845));
        agilityScript.canafisCourse.add(new AgilityObstacleModel(GAP_14848));
        agilityScript.canafisCourse.add(new AgilityObstacleModel(GAP_14846));
        agilityScript.canafisCourse.add(new AgilityObstacleModel(POLEVAULT));
        agilityScript.canafisCourse.add(new AgilityObstacleModel(GAP_14847));
        agilityScript.canafisCourse.add(new AgilityObstacleModel(GAP_14897));

        // Falador
        agilityScript.faladorCourse.add(new AgilityObstacleModel(ROUGH_WALL_14898));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(TIGHTROPE_14899));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(HAND_HOLDS_14901));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(GAP_14903));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(GAP_14904));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(TIGHTROPE_14905));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(TIGHTROPE_14911));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(GAP_14919));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(LEDGE_14920));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(LEDGE_14921));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(LEDGE_14922));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(LEDGE_14924));
        agilityScript.faladorCourse.add(new AgilityObstacleModel(EDGE_14925));

        // Seers
        agilityScript.seersCourse.add(new AgilityObstacleModel(WALL_14927));
        agilityScript.seersCourse.add(new AgilityObstacleModel(GAP_14928));
        agilityScript.seersCourse.add(new AgilityObstacleModel(TIGHTROPE_14932));
        agilityScript.seersCourse.add(new AgilityObstacleModel(GAP_14929));
        agilityScript.seersCourse.add(new AgilityObstacleModel(GAP_14930));
        agilityScript.seersCourse.add(new AgilityObstacleModel(EDGE_14931));

        agilityScript.run(config);}

    protected void shutDown() {
        agilityScript.shutdown();
        agilityScript.canafisCourse = new ArrayList<>();
        agilityScript.faladorCourse = new ArrayList<>();
        overlayManager.remove(agilityOverlay);
    }
}

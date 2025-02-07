package net.runelite.client.plugins.microbot.util.magic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.coords.WorldPoint;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum Teleport {
    VARROCK(25,
            new Pair[] {Pair.of("law rune", 1), Pair.of("air rune", 3), Pair.of("fire rune", 1)},
            new WorldPoint(3213, 3425, 0), "<col=00ff00>Varrock Teleport</col>", "Varrock teleport"),
    LUMBRIDGE(31,
                    new Pair[] {Pair.of("law rune", 1), Pair.of("air rune", 3), Pair.of("earth rune", 1)},
            new WorldPoint(3222, 3218, 0), "<col=00ff00>Lumbridge Teleport</col>", "Lumbridge teleport"),
    FALADOR(37,
                      new Pair[] {Pair.of("law rune", 1), Pair.of("air rune", 3), Pair.of("water rune", 1)},
            new WorldPoint(3093, 3380, 0), "<col=00ff00>Falador Teleport</col>", "Falador teleport"),
    CAMELOT(45,
                    new Pair[] {Pair.of("law rune", 1), Pair.of("air rune", 5)},
            new WorldPoint(2885, 3478, 0), "<col=00ff00>Camelot Teleport</col>", "Camelot teleport"),

    ARDOUGNE(51,
                    new Pair[] {Pair.of("law rune", 2), Pair.of("water rune", 2)},
            new WorldPoint(2789, 3306, 0), "<col=00ff00>Ardougne Teleport</col>", "Ardougne teleport");

    private final int level;
    private final Pair[] itemsRequired;
    private final WorldPoint destination;
    private final String widgetText;
    private final String tabletName;
}

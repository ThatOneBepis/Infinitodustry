package infinitodustry.content;

import arc.struct.Seq;
import mindustry.content.TechTree;
import mindustry.content.TechTree.TechNode;
import mindustry.ctype.ContentList;
import mindustry.ctype.UnlockableContent;
import mindustry.type.ItemStack;
import mindustry.content.*;
import mindustry.game.Objectives.*;

import static mindustry.content.Blocks.*;
import static mindustry.type.ItemStack.with;

import static infinitodustry.content.VanillaBlocks.*;

public class InfinitodustryTechTree implements ContentList{
    private static TechNode context = null;

    @Override
    public void load(){
    private static void attachNode(UnlockableContent parent, Runnable children){
        TechNode parnode = TechTree.all.find(t -> t.content == parent);
        context = parnode;
        children.run();
    };

    private static void node(UnlockableContent content, ItemStack[] requirements, Seq<Objective> objectives, Runnable children){
        TechNode node = new TechNode(context, content, requirements);
        if(objectives != null) node.objectives = objectives;
        TechNode prev = context;
        context = node;
        children.run();
        context = prev;
    };

    private static void node(UnlockableContent content, ItemStack[] requirements, Runnable children){
        node(content, requirements, null, children);
    };

    private static void node(UnlockableContent content, Seq<Objective> objectives, Runnable children){
        node(content, content.researchRequirements(), objectives, children);
    };

    private static void node(UnlockableContent content, Runnable children){
        node(content, content.researchRequirements(), children);
    };

    private static void node(UnlockableContent block){
        node(block, () -> {});
    };

    private static void nodeProduce(UnlockableContent content, Seq<Objective> objectives, Runnable children){
        node(content, content.researchRequirements(), objectives.and(new Produce(content)), children);
    };

    private static void nodeProduce(UnlockableContent content, Runnable children){
        nodeProduce(content, new Seq<>(), children);
    };
}

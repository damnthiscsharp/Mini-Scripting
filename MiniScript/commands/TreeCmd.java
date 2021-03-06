package MiniScript.commands;

import java.util.Collection;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import MiniScript.loader.scripting.Script;

public class TreeCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg,
			String[] args) {
		
		Collection<Script> scripts = MiniScript.MiniScript.getFileLoader().getScripts();
		
		sender.sendMessage("ｧl覧覧覧覧覧覧覧覧覧覧覧覧覧");
		sender.sendMessage("");
		sender.sendMessage("ｧeAll loaded scripts : ");
		
		if(!scripts.isEmpty())
		{
			for(Script script : scripts)
				sender.sendMessage("ｧ7 - ｧc" + script.getName() + " ｧ7: "+ (script.isEnabled() ? "ｧaOn" : "ｧcOff"));
		} else
		{
			sender.sendMessage("   ｧcCan't find any scripts.");
		}
		
		sender.sendMessage("");
		sender.sendMessage("ｧl覧覧覧覧覧覧覧覧覧覧覧覧覧");
		
		return true;
	}

}

package Kanye.Kanye_BOT;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter 
{
	int fing;
	
    public static void main( String[] args ) throws Exception
    {
    	JDA jda = new JDABuilder(AccountType.BOT).setToken(Ref.token).buildBlocking();
    	jda.addEventListener(new App ());
    	jda.setAutoReconnect(true);
    		
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent evt)
    {
    	// Objects
    	User objUser = evt.getAuthor();
    	MessageChannel objMsgCh= evt.getChannel();
    	Message objMsg = evt.getMessage();
    	
    	//commands
    	if(objUser.isBot()) {
    		return;
    	}
    	if(objMsg.getContentRaw().contains("finger")) {
    		objMsgCh.sendMessage("I sure do love big fingers in my ass").queue();
    	}
    	if(objMsg.getContentRaw().contains("kanye"))
    	{
    		objMsgCh.sendMessage("Kanye? Ain't he the guy who likes big fingers in his ass?").queue();
    	}
    	if(objMsg.getContentRaw().contains("sunday")) {
    		objMsgCh.sendMessage("Sunday? Perfect day for some fingers in my ass").queue();
    	}
    	if(objMsg.getContentRaw().contains("ass"))
    	{
    		objMsgCh.sendMessage("Ass? Perfect place for my fingers").queue();
    	}
    	if(objMsg.getContentRaw().contains("thumb")) {
    		objMsgCh.sendMessage("**KANYE'S THUMB STATUS:** entrenched in asshole").queue();
    	}
   		
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"add")) {
    		++fing;
    		objMsgCh.sendMessage("There are now " + fing + " fingers in my ass").queue();
    	}
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"remove")) {
    		--fing;
    		objMsgCh.sendMessage("There are now " + fing + " fingers in my ass").queue();
    	}
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"count")) {
    		objMsgCh.sendMessage("There are currently " + fing + " fingers in my ass").queue();
    	}
    }
}
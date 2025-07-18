public class Commands{
	
	public void gitInit() {
        System.out.println("git init - Initializes a new Git repository.");
    	}
	public void gitStatus() {
        System.out.println("git status - Shows the working directory status.");
    	}
    	public void gitAdd() {
        System.out.println("git add . - Stages all changes for commit.");
    	}
 	public void gitCommit() {
        System.out.println("git commit -m \"message\" - Commits staged changes 	with a message.");
    	}
   	 public void gitRemote() {
        System.out.println("git remote add origin <URL> - Adds a remote 	repository.");
   	 }
   	 public void gitPush() {
        System.out.println("git push -u origin main - Pushes commits to the 	remote main branch.");
    	}
	public void gitPull() {
        System.out.println("git pull - Fetches and merges changes from remote to local.");
    	}

	public static void main(String[] args) {
		
        	Commands c = new Commands();

        	c.gitInit();
       	 	c.gitStatus();
       		c.gitAdd();
        	c.gitCommit();
        	c.gitRemote();
        	c.gitPush();
        	c.gitPull();
        	c.gitClone();
    	}

}

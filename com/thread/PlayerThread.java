package com.thread;

public class PlayerThread extends Thread {
	public PlayerThread(ThreadGroup gp, String name) {
		super(gp, name);

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			String msg = getName();
			msg += "  played match# " + i;
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("India");
		PlayerThread p = new PlayerThread(group, "manoj");
		PlayerThread p2 = new PlayerThread(group, "patidar");
		p.start();
		p2.start();
		/*System.out.println("Thread Group Info");
		System.out.println("Name"+group.getName());
		System.out.println("Parent Group"+group.getParent());
		System.out.println("Active Threads"+group.activeCount());
		System.out.println("Active Sub Group"+group.activeGroupCount());
*/

	}
}
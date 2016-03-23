package com.training.apps;

import javax.jcr.Credentials;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class SecondHop {

	public static void main(String[] args) {

		try {

			Repository repo = new TransientRepository();

			Credentials crd = new SimpleCredentials("admin", "admin".toCharArray());

			Session session = null;

			session = repo.login(crd);

			Node rootNode = session.getRootNode();

			Node node1 = rootNode.addNode("chapter1");

			Node node2 = rootNode.addNode("chapter2");

			node1.setProperty("What is Java", "Java is an OOP Lang");

			node2.setProperty("What is an Object", "Object is an Instance of a Class");

			session.save();

			Node mynode1 = rootNode.getNode("chapter1");
			System.out.println(mynode1.getPath());

			Node mynode2 = rootNode.getNode("chapter2");
			System.out.println(mynode2.getPath());

			System.out.println(mynode1.getProperty("What is Java").getString());
			System.out.println(mynode2.getProperty("What is an Object").getString());

			session.logout();

		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

}

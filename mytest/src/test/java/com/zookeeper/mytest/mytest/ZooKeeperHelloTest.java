package com.zookeeper.mytest.mytest;

import org.I0Itec.zkclient.ZkClient;
import org.junit.Test;

public class ZooKeeperHelloTest {
	@Test
    public void testZkClient() {
        ZkClient zkClient = new ZkClient("192.168.211.128:2181,192.168.211.128:2182,192.168.211.128:2183");
        String node = "/app2";
        if (!zkClient.exists(node)) {
            zkClient.createPersistent(node, "hello zk");
        }
        System.out.println(zkClient.readData(node));
	}   
}

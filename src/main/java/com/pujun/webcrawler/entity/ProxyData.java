package com.pujun.webcrawler.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProxyData {
    private static List<String> ipList=new ArrayList<String>();
    public ProxyData() {
    	if (ipList.size()==0) {
    		ipList.add("111.23.10.9:80");
    		ipList.add("111.23.10.6:80");
    		ipList.add("111.23.10.8:80");
    		ipList.add("118.81.241.64:80");
    		ipList.add("111.13.109.52:80");
    		ipList.add("111.23.10.7:80");
    		ipList.add("223.94.132.221:8123");
    		ipList.add("39.170.254.172:8123");
    		ipList.add("39.184.47.237:8123");
    		ipList.add("39.190.179.104:8123");
    		ipList.add("39.177.244.250:8123");
    		ipList.add("39.185.158.143:8123");
    		ipList.add("112.12.254.171:8123");
    		ipList.add("122.226.3.246:80");
    		ipList.add("39.177.231.224:8123");
    		ipList.add("112.15.92.3:8123");
    		ipList.add("39.176.171.215:8123");
    		ipList.add("39.171.107.75:8123");
    		ipList.add("39.171.114.180:8123");
    		ipList.add("39.171.131.112:8123");
    		ipList.add("58.210.44.162:80");
    		ipList.add("61.223.163.53:8888");
    		ipList.add("119.96.233.219:8090");
    		ipList.add("106.38.194.199:80");
    		ipList.add("218.189.26.20:8080");
    		ipList.add("125.230.150.162:8888");
    		ipList.add("114.38.135.52:8888");
    		ipList.add("110.86.83.246:8090");
    		ipList.add("111.253.89.89:8888");
    		ipList.add("61.224.151.234:8888");
    		ipList.add("182.40.48.115:8090");
    		ipList.add("36.235.160.126:8888");
    		ipList.add("111.253.91.111:8888");
    		ipList.add("61.224.146.199:8888");
    		ipList.add("114.26.1.213:8888");
    		ipList.add("119.253.252.27:3128");
    		ipList.add("123.59.12.25:80");
    		ipList.add("125.123.82.186:3128");
    		ipList.add("58.220.10.7:80");
    		ipList.add("27.9.163.162:8090");
    		ipList.add("106.41.235.224:80");
    		ipList.add("110.176.166.11:80");
    		ipList.add("106.60.63.13:80");
    		ipList.add("183.40.150.146:3128");
    		ipList.add("36.237.17.85:3128");
    		ipList.add("220.143.64.198:3128");
    		ipList.add("106.60.73.83:80");
    		ipList.add("218.193.132.35:808");
    		ipList.add("106.60.56.33:80");
    		ipList.add("106.60.103.45:3128");
    		ipList.add("182.206.42.11:3128");
    		ipList.add("110.176.31.61:80");
    		ipList.add("182.205.57.33:3128");
    		ipList.add("110.176.151.31:3128");
    		ipList.add("171.9.242.16:3128");
    		ipList.add("110.176.21.16:80");
    		ipList.add("1.181.16.72:3128");
    		ipList.add("106.34.202.217:3128");
    		ipList.add("171.219.166.57:3128");
    		ipList.add("59.37.206.142:9000");
    		ipList.add("146.185.252.10:8888");
    		ipList.add("37.29.75.225:8080");
    		ipList.add("213.85.92.10:80");
    		ipList.add("203.205.28.219:8000");
    		ipList.add("50.56.218.67:3129");
    		ipList.add("5.196.208.4:3128");
    		ipList.add("93.170.253.51:3128");
    		ipList.add("93.188.172.121:80");
    		ipList.add("50.240.46.244:7004");
    		ipList.add("37.29.123.158:8080");
    		ipList.add("114.207.216.220:80");
    		ipList.add("183.111.169.202:3128");
    		ipList.add("219.112.217.237:8080");
    		ipList.add("118.45.227.95:808");
    		ipList.add("204.29.120.89:21320");
    		ipList.add("180.183.117.170:8080");
    		ipList.add("183.111.169.201:3128");
    		ipList.add("183.111.169.209:3128");
    		ipList.add("183.89.179.21:8080");
    		ipList.add("183.111.169.206:3128");
    		ipList.add("118.173.91.184:8080");
    		ipList.add("125.24.69.37:8080");
    		ipList.add("187.121.135.41:3128");
    		ipList.add("95.189.243.192:8080");
    		ipList.add("103.10.22.242:3128");
    		ipList.add("190.63.157.226:8081");
    		ipList.add("165.139.179.225:8080");
    		ipList.add("187.114.34.155:8080");
    		ipList.add("175.100.6.126:8080");
    		ipList.add("189.201.240.46:8080");
    		ipList.add("177.220.184.221:3128");
    		ipList.add("104.46.60.254:8080");
    		ipList.add("103.226.53.22:8080");
    		ipList.add("198.169.246.30:80");
    		ipList.add("125.24.140.64:8080");
    		ipList.add("189.51.100.206:3128");
    		ipList.add("158.69.137.17:7808");
    		ipList.add("61.7.178.4:8080");
    		ipList.add("54.207.114.172:3333");
    		ipList.add("69.147.161.182:8080");
    		ipList.add("120.195.198.119:80");
    		ipList.add("219.142.192.196:45313");
    		ipList.add("120.195.193.177:80");
    		ipList.add("120.195.196.102:80");
    		ipList.add("120.195.202.20:80");
    		ipList.add("120.195.199.236:80");
    		ipList.add("39.189.109.205:8123");
    		ipList.add("120.195.201.167:80");
    		ipList.add("120.195.198.166:80");
    		ipList.add("120.195.201.155:80");
    		ipList.add("20.195.198.121:80");
    		ipList.add("59.62.16.160:9000");
    		ipList.add("219.142.192.196:9781");
    		ipList.add("120.195.198.17:80");
    		ipList.add("220.176.94.140:9000");
    		ipList.add("120.195.205.170:80");
    		ipList.add("120.195.199.39:80");
    		ipList.add("36.61.161.158:3128");
    		ipList.add("120.195.205.233:80");
    		ipList.add("218.92.227.172:34061");
    		ipList.add("115.218.121.213:9000");
    		ipList.add("120.195.206.23:80");
    		ipList.add("211.89.233.6:80");
    		ipList.add("218.92.227.168:18186");
    		ipList.add("120.195.203.40:80");
    		ipList.add("120.195.203.218:80");
    		ipList.add("36.234.80.168:8888");
    		ipList.add("120.195.195.244:80");
    		ipList.add("120.195.199.7:80");
    		ipList.add("120.195.200.132:80");
    		ipList.add("120.195.197.167:80");
    		ipList.add("120.195.203.211:80");
    		ipList.add("120.195.205.60:80");
    		ipList.add("120.195.206.240:80");
    		ipList.add("58.210.44.162:80");
    		ipList.add("120.195.201.110:80");
    		ipList.add("182.90.81.245:80");
    		ipList.add("115.218.120.153:9000");
    		ipList.add("123.15.32.34:8080");
    		ipList.add("218.15.22.243:3128");
    		ipList.add("182.90.13.223:80");
    		ipList.add("223.92.162.89:8123");
    		ipList.add("120.195.197.234:80");
    		ipList.add("111.252.143.172:8888");
    		ipList.add("110.176.124.56:80");
    		ipList.add("223.93.92.139:8123");
    		ipList.add("120.195.194.215:80");
    		ipList.add("106.33.146.64:3128");
    		ipList.add("120.195.199.235:80");
    		ipList.add("120.195.192.162:80");
    		ipList.add("119.103.43.41:3128");
    		ipList.add("101.82.249.168:80");
    		ipList.add("120.195.198.160:80");
    		ipList.add("117.158.98.214:80");
    		ipList.add("218.92.227.166:18888");
    		ipList.add("218.92.227.165:10080");
    		ipList.add("118.170.36.185:8888");
    		ipList.add("182.18.19.222:3128");
    		ipList.add("1.165.232.27:8888");
    		ipList.add("182.254.211.14:10000");
        	ipList.add("120.195.207.109:80");
        	ipList.add("120.195.203.226:80");
        	ipList.add("120.195.193.220:80");
        	ipList.add("120.195.205.133:80");
        	ipList.add("39.189.69.132:8123");
        	ipList.add("120.195.195.57:80");
        	ipList.add("120.195.205.237:80");
        	ipList.add("113.80.239.127:9000");
        	ipList.add("111.40.196.70:80");
        	ipList.add("219.142.192.196:9000");
        	ipList.add("20.195.205.9:80");
        	ipList.add("183.40.128.112:3128");
        	ipList.add("120.195.204.211:80");
        	ipList.add("120.195.199.25:80");
        	ipList.add("61.144.82.33:9797");
        	ipList.add("203.71.220.140:80");
        	ipList.add("120.195.199.211:80");
        	ipList.add("219.142.192.196:5115");
        	ipList.add("120.195.196.157:80");
        	ipList.add("120.195.202.80:80");
        	ipList.add("116.210.18.158:9000");
        	ipList.add("1.63.251.94:9000");
        	ipList.add("120.195.197.136:80");
        	ipList.add("115.218.122.54:9000");
        	ipList.add("60.190.96.190:808");
        	ipList.add("120.195.192.150:80");
        	ipList.add("58.251.227.246:9999");
        	ipList.add("120.195.200.50:80");
        	ipList.add("120.195.197.127:80");
        	ipList.add("120.195.192.218:80");
        	ipList.add("60.191.154.246:3128");
        	ipList.add("120.195.192.109:80");
        	ipList.add("106.34.16.177:3128");
        	ipList.add("120.195.199.95:80");
        	ipList.add("120.195.201.157:80");
        	ipList.add("218.92.227.172:21724");
        	ipList.add("120.195.197.78:80");
        	ipList.add("14.218.242.245:9797");
        	ipList.add("183.211.91.41:8123");
        	ipList.add("120.195.205.6:80");
        	ipList.add("58.218.198.61:808");
        	ipList.add("122.232.227.20:3128");
        	ipList.add("110.72.255.67:8123");
        	ipList.add("183.140.165.61:80");
        	ipList.add("36.235.40.56:8888");
        	ipList.add("111.252.138.1:8888");
        	ipList.add("106.38.194.199:80");
        	ipList.add("183.141.77.188:3128");
        	ipList.add("58.220.10.7:80");
        	ipList.add("118.170.34.248:8888");
        	ipList.add("114.46.113.18:8888");
        	ipList.add("218.189.26.20:8080");
        	ipList.add("36.233.227.31:8888");
        	ipList.add("61.223.231.152:8888");
        	ipList.add("110.73.49.156:8123");
        	ipList.add("114.38.132.140:8888");
        	ipList.add("58.210.44.162:80");
        	ipList.add("171.38.64.14:8123");
        	ipList.add("118.170.43.226:8888");
        	ipList.add("36.234.90.120:8888");
        	ipList.add("49.93.203.124:80");
        	ipList.add("117.37.253.160:3128");
        	ipList.add("110.176.167.121:3128");
        	ipList.add("171.82.66.235:80");
        	ipList.add("110.176.103.210:3128");
        	ipList.add("218.193.132.35:808");
        	ipList.add("106.60.45.48:3128");
        	ipList.add("106.60.125.233:3128");
        	ipList.add("182.206.55.27:80");
        	ipList.add("49.93.24.145:3128");
        	ipList.add("106.60.71.154:3128");
        	ipList.add("101.82.212.111:80");
        	ipList.add("171.9.253.94:3128");
        	ipList.add("113.125.22.60:80");
        	ipList.add("113.125.134.248:80");
        	ipList.add("171.218.246.150:80");
        	ipList.add("113.127.92.15:80");
        	ipList.add("49.93.215.14:3128");
        	ipList.add("183.42.120.149:3128");
        	ipList.add("182.162.141.7:80");
        	ipList.add("222.237.30.179:80");
        	ipList.add("213.85.92.10:80");
        	ipList.add("183.111.169.204:3128");
        	ipList.add("93.170.253.51:3128");
        	ipList.add("203.205.28.219:8000");
        	ipList.add("5.56.16.152:3128");
        	ipList.add("106.240.250.106:808");
        	ipList.add("117.240.187.35:3128");
        	ipList.add("93.188.172.121:80");
        	ipList.add("121.149.232.110:3129");
        	ipList.add("108.165.33.7:3128");
        	ipList.add("183.89.72.58:8080");
        	ipList.add("146.185.252.10:8888");
        	ipList.add("37.29.75.225:8080");
        	ipList.add("50.56.218.67:3129");
        	ipList.add("5.196.208.4:3128");
        	ipList.add("50.240.46.244:7004");
        	ipList.add("37.29.123.158:8080");
        	ipList.add("114.207.216.220:80");
        	ipList.add("138.0.89.100:8080");
        	ipList.add("5.135.163.225:8080");
        	ipList.add("188.166.251.81:3128");
        	ipList.add("110.164.223.249:8080");
        	ipList.add("190.121.148.174:8080");
        	ipList.add("200.87.179.178:8080");
        	ipList.add("200.165.6.165:8080");
        	ipList.add("118.173.60.186:8080");
        	ipList.add("165.139.179.225:8080");
        	ipList.add("54.207.114.172:3333");
        	ipList.add("190.63.157.226:8081");
        	ipList.add("198.169.246.30:80");
        	ipList.add("194.83.240.11:8080");
        	ipList.add("177.135.180.180:3128");
        	ipList.add("125.24.127.184:8080");
        	ipList.add("158.69.137.17:7808");
        	ipList.add("150.129.130.180:8080");
        	ipList.add("103.10.22.242:3128");
        	ipList.add("69.147.161.182:8080");
        	ipList.add("77.55.245.38:3128");
		}
	}
	public String getProxy() {
		Random random=new Random();
		int no=random.nextInt(ipList.size()-1);
		return ipList.get(no);
	}
    
}
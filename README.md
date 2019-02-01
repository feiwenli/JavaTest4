### java 基础测试4
- 没做出来

#### EXAM1
使用sakila 数据库。
下载成功之后，将sakila-schema.sql 和sakila-data.sql 放在 项目根目录docker/mysql/文件夹下。
程序使用mysql + spring + mybatis。

要求：

使用Spring 技术实现往film 表中插入一条数据，具体实现过程有以下要求：

1、Spring的配置文件名称为 applicationContext.xml。

2、Mybatis的配置文件名称为applicationContext-mybatis.xml。

3、数据库的driver 和数据库名称 信息从db.properties中获取，ip，端口，用户名，密码从环境变量中读
取。

4、在启动ApplicationContext时输出Context Start信息，在ApplicationContext停止时输出Context
stop信息。

5、使用AOP实现，在将film数据插入数据库表中之前publish Spring的事件BeforeInsertFilmEvent，在
将film插入数据库之后publish Spring的事件AfterInsertFilmEvent。

6、接收到BeforeInsertFilmEvent事件，输出Before Insert Film Data。接收到
AfterInsertFilmEvent事件，输出After Insert Film Data。

7、程序中使用的title，description 和languageId 需要从环境变量中读取。环境变量配置在dockercompose。接收到信息后，使用mybatis 将用户输入的数据插入表中。

8、整个过程都需要在事物之下执行。分两个事物，第一次插入手动抛异常，让事物进行回滚。第二次正常插入

9、整个交互过程如下:
```
Context Start
Film Title:
xxxxx
Film Description:
xxxxxxxxxxxx
Film LanguageId:
1
Before Insert Film Data
After Insert Film Data
Context Stop
```
##### 附加题（5分）
使用Mybatis的插件机制实现统计sql执行时间。并在最后打印出sql实际的执行时间。


- 运行步骤
	- git clone git@github.com:feiwenli/JavaTest4.git



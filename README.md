JDK:17
run com.qcrrm.mybatissqlitedemo.InitTable.main() to init sqlite database

Could not find resource mapper/UserMapper.xml
when I create the folder 'mapper' in 'src/main/resources/',


```
Exception in thread "JavaFX Application Thread" java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
	at javafx.fxml/javafx.fxml.FXMLLoader$MethodHandler.invoke(FXMLLoader.java:1857)
	at javafx.fxml/javafx.fxml.FXMLLoader$ControllerMethodEventHandler.handle(FXMLLoader.java:1724)
	at javafx.base/com.sun.javafx.event.CompositeEventHandler.dispatchBubblingEvent(CompositeEventHandler.java:86)
	at javafx.base/com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:234)
	at javafx.base/com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:191)
	at javafx.base/com.sun.javafx.event.CompositeEventDispatcher.dispatchBubblingEvent(CompositeEventDispatcher.java:59)
	at javafx.base/com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:58)
	at javafx.base/com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at javafx.base/com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:56)
	at javafx.base/com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at javafx.base/com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:56)
	at javafx.base/com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at javafx.base/com.sun.javafx.event.EventUtil.fireEventImpl(EventUtil.java:74)
	at javafx.base/com.sun.javafx.event.EventUtil.fireEvent(EventUtil.java:49)
	at javafx.base/javafx.event.Event.fireEvent(Event.java:198)
	at javafx.graphics/javafx.scene.Node.fireEvent(Node.java:8792)
	at javafx.controls/javafx.scene.control.Button.fire(Button.java:203)
	at javafx.controls/com.sun.javafx.scene.control.behavior.ButtonBehavior.mouseReleased(ButtonBehavior.java:208)
	at javafx.controls/com.sun.javafx.scene.control.inputmap.InputMap.handle(InputMap.java:274)
	at javafx.base/com.sun.javafx.event.CompositeEventHandler$NormalEventHandlerRecord.handleBubblingEvent(CompositeEventHandler.java:247)
	at javafx.base/com.sun.javafx.event.CompositeEventHandler.dispatchBubblingEvent(CompositeEventHandler.java:80)
	at javafx.base/com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:234)
	at javafx.base/com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:191)
	at javafx.base/com.sun.javafx.event.CompositeEventDispatcher.dispatchBubblingEvent(CompositeEventDispatcher.java:59)
	at javafx.base/com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:58)
	at javafx.base/com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at javafx.base/com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:56)
	at javafx.base/com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at javafx.base/com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:56)
	at javafx.base/com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at javafx.base/com.sun.javafx.event.EventUtil.fireEventImpl(EventUtil.java:74)
	at javafx.base/com.sun.javafx.event.EventUtil.fireEvent(EventUtil.java:54)
	at javafx.base/javafx.event.Event.fireEvent(Event.java:198)
	at javafx.graphics/javafx.scene.Scene$MouseHandler.process(Scene.java:3897)
	at javafx.graphics/javafx.scene.Scene.processMouseEvent(Scene.java:1878)
	at javafx.graphics/javafx.scene.Scene$ScenePeerListener.mouseEvent(Scene.java:2623)
	at javafx.graphics/com.sun.javafx.tk.quantum.GlassViewEventHandler$MouseEventNotification.run(GlassViewEventHandler.java:411)
	at javafx.graphics/com.sun.javafx.tk.quantum.GlassViewEventHandler$MouseEventNotification.run(GlassViewEventHandler.java:301)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:399)
	at javafx.graphics/com.sun.javafx.tk.quantum.GlassViewEventHandler.lambda$handleMouseEvent$2(GlassViewEventHandler.java:450)
	at javafx.graphics/com.sun.javafx.tk.quantum.QuantumToolkit.runWithoutRenderLock(QuantumToolkit.java:424)
	at javafx.graphics/com.sun.javafx.tk.quantum.GlassViewEventHandler.handleMouseEvent(GlassViewEventHandler.java:449)
	at javafx.graphics/com.sun.glass.ui.View.handleMouseEvent(View.java:557)
	at javafx.graphics/com.sun.glass.ui.View.notifyMouse(View.java:943)
	at javafx.graphics/com.sun.glass.ui.win.WinApplication._runLoop(Native Method)
	at javafx.graphics/com.sun.glass.ui.win.WinApplication.lambda$runLoop$3(WinApplication.java:184)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at com.sun.javafx.reflect.Trampoline.invoke(MethodUtil.java:77)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at javafx.base/com.sun.javafx.reflect.MethodUtil.invoke(MethodUtil.java:275)
	at javafx.fxml/com.sun.javafx.fxml.MethodHelper.invoke(MethodHelper.java:84)
	at javafx.fxml/javafx.fxml.FXMLLoader$MethodHandler.invoke(FXMLLoader.java:1854)
	... 46 more
Caused by: java.lang.ExceptionInInitializerError
	at com.qcrrm.mybatissqlitedemo/com.qcrrm.mybatissqlitedemo.HelloController.onHelloButtonClick(HelloController.java:19)
	... 58 more
Caused by: org.apache.ibatis.exceptions.PersistenceException: 
### Error building SqlSession.
### The error may exist in mapper/UserMapper.xml
### Cause: org.apache.ibatis.builder.BuilderException: Error parsing SQL Mapper Configuration. Cause: java.io.IOException: Could not find resource mapper/UserMapper.xml
	at org.mybatis@3.5.11/org.apache.ibatis.exceptions.ExceptionFactory.wrapException(ExceptionFactory.java:30)
	at org.mybatis@3.5.11/org.apache.ibatis.session.SqlSessionFactoryBuilder.build(SqlSessionFactoryBuilder.java:82)
	at org.mybatis@3.5.11/org.apache.ibatis.session.SqlSessionFactoryBuilder.build(SqlSessionFactoryBuilder.java:66)
	at com.qcrrm.mybatissqlitedemo/com.qcrrm.mybatissqlitedemo.util.MybatisUtil.<clinit>(MybatisUtil.java:24)
	... 59 more
Caused by: org.apache.ibatis.builder.BuilderException: Error parsing SQL Mapper Configuration. Cause: java.io.IOException: Could not find resource mapper/UserMapper.xml
	at org.mybatis@3.5.11/org.apache.ibatis.builder.xml.XMLConfigBuilder.parseConfiguration(XMLConfigBuilder.java:122)
	at org.mybatis@3.5.11/org.apache.ibatis.builder.xml.XMLConfigBuilder.parse(XMLConfigBuilder.java:99)
	at org.mybatis@3.5.11/org.apache.ibatis.session.SqlSessionFactoryBuilder.build(SqlSessionFactoryBuilder.java:80)
	... 61 more
Caused by: java.io.IOException: Could not find resource mapper/UserMapper.xml
	at org.mybatis@3.5.11/org.apache.ibatis.io.Resources.getResourceAsStream(Resources.java:114)
	at org.mybatis@3.5.11/org.apache.ibatis.io.Resources.getResourceAsStream(Resources.java:100)
	at org.mybatis@3.5.11/org.apache.ibatis.builder.xml.XMLConfigBuilder.mapperElement(XMLConfigBuilder.java:378)
	at org.mybatis@3.5.11/org.apache.ibatis.builder.xml.XMLConfigBuilder.parseConfiguration(XMLConfigBuilder.java:120)
	... 63 more
```
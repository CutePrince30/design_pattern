代理模式
---
是以生活中的代替别人送礼物为例子。

其原理是有一个接口来定义Real和Porxy都有哪些行为
然后Real和Proxy都实现这些接口，并在Proxy中实例化Real，调用Real的行为
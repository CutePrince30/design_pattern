模版模式
---
定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模版方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤

此demo是基于试题答卷为模型，Question和Answer都在TestPaper类中，Question为题目，是具体的方法；Answer为答案，是抽象的方法，因为可以在
子类中得以实现
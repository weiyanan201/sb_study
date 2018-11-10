
匹配类
    实现Condition接口 条件满足返回true

config
    注册bean 添加 注解 @Conditional(MacCondition.class)

service
    实现接口，条件满足时config会返回目标service

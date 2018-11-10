
config
    开启 @EnableAsync
    getAsyncExecutor 定义自己的线程池
            ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
            taskExecutor.setCorePoolSize(30);
            taskExecutor.setMaxPoolSize(50);
            taskExecutor.setQueueCapacity(200);
            taskExecutor.initialize();
异步方法添加注释@Async  也可以直接加在类上表示所有方法都是异步

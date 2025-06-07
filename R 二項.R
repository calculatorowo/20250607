#二項分配參數
n<-10 #試驗次數
p<-0.5 #成功機率

#計算X的機率質量函數(PMF)
x<-0:n
pmf<-dbinom(x, size=n, prob=p)

#繪製二項分配圖形
barplot(pmf,names.arg=x, col="purple",
        main="二項分配機率圖(n=10, p=0.5)",
        xlab= "number of success",ylab="probability")

n<-10
p<-0.5
x<-5
prob <- dbinom(x,size=n,prob=p)
prob
#輸出為0.2461
cdf <- pbinom(x,size=n,prob=p)
cdf
#輸出為0.6230


<h1 align=center>Kubernetes Tutorials ï½ k8s æç¨</h1>

[![GitHub forks](https://img.shields.io/github/forks/guangzhengli/k8s-tutorials)](https://github.com/guangzhengli/k8s-tutorials/network)[![GitHub stars](https://img.shields.io/github/stars/guangzhengli/k8s-tutorials)](https://github.com/guangzhengli/k8s-tutorials/stargazers)[![GitHub issues](https://img.shields.io/github/issues/guangzhengli/k8s-tutorials)](https://github.com/guangzhengli/k8s-tutorials/issues)[![GitHub license](https://img.shields.io/github/license/guangzhengli/k8s-tutorials)](https://github.com/guangzhengli/k8s-tutorials/blob/main/LICENSE)

<h4 align=center>ð Kubernetes | ð° Tutorials</h4>

k8s ä½ä¸ºäºåçæ¶ä»£çæä½ç³»ç»ï¼å­¦ä¹ å®çå¿è¦æ§ä¸è¨èå»ï¼å¦æä½ éå°äºä»»ä½é®é¢ï¼å¯ä»¥å¨ [Discussions](https://github.com/guangzhengli/k8s-tutorials/discussions) ä¸­è¯è®ºæè Issue ä¸­æåºï¼å¦æä½ è§å¾è¿ä¸ªä»åºå¯¹ä½ æä»·å¼ï¼æ¬¢è¿ star æèæ PR / Issueï¼è®©å®åå¾æ´å¥½ï¼

å¨å­¦ä¹ æ¬æç¨åï¼éè¦æ³¨ææ¬æç¨ä¾§éäºå®æå¼å¯¼ï¼ä»¥æ¸è¿å¼ä¿®æ¹ä»£ç çæ¹å¼ï¼å°ä»æåºç¡ç container å®¹å¨çå®ä¹å¼å§ï¼ç»è¿ `pod`, `deployment`, `service`,  `ingress`, `configmap`, `secret` ç­èµæºç´å°ç¨ `helm` æ¥æåé¨ç½²ä¸å¥å®æ´æå¡ãæä»¥å¦æä½ å¯¹å®¹å¨å k8s çåºç¡çè®ºç¥è¯ä¸çäºè§£çè¯ï¼å»ºè®®åä» [å®ç½ææ¡£](https://kubernetes.io/zh-cn/docs/home/) æèå¶å®æç¨è·ååºç¡çè®ºç¥è¯ï¼åéè¿å®æå æ·±å¯¹ç¥è¯çææ¡ï¼

è¿éæ¯ææ¡£çç´¢å¼ï¼
* [åå¤å·¥ä½](docs/pre.md)
* [container](docs/container.md)
* [pod](docs/pod.md)
* [deployment](docs/deployment.md)
* [service](docs/service.md)
* [ingress](docs/ingress.md)
* [namespace](docs/namespace.md)
* [configmap](docs/configmap.md)
* [secret](docs/secret.md)
* [job/cronjob](docs/job.md)
* [helm](docs/helm.md)
* [dashboard](docs/dashboard.md)
* Translate English(æªå®æ)

ä¸é¢æ¯ææææ¡£çéåï¼

- [kubernetes tutorials](#kubernetes-tutorials)
  - [åå¤å·¥ä½](#åå¤å·¥ä½)
    - [å®è£ docker](#å®è£-docker)
      - [æ¨èå®è£æ¹æ³](#æ¨èå®è£æ¹æ³)
      - [å¶å®å®è£æ¹æ³](#å¶å®å®è£æ¹æ³)
    - [å®è£ minikube](#å®è£-minikube)
      - [å¯å¨ minikube](#å¯å¨-minikube)
    - [å®è£ kubectl](#å®è£-kubectl)
    - [æ³¨å docker hub è´¦å·ç»å½](#æ³¨å-docker-hub-è´¦å·ç»å½)
  - [Container](#container)
  - [Pod](#pod)
    - [Pod ä¸ Container çä¸å](#pod-ä¸-container-çä¸å)
    - [Pod å¶å®å½ä»¤](#pod-å¶å®å½ä»¤)
  - [Deployment](#deployment)
    - [æ©å®¹](#æ©å®¹)
    - [åçº§çæ¬](#åçº§çæ¬)
    - [Rolling Update(æ»å¨æ´æ°)](#rolling-updateæ»å¨æ´æ°)
    - [å­æ´»æ¢é (livenessProb)](#å­æ´»æ¢é-livenessprob)
    - [å°±ç»ªæ¢é (readiness)](#å°±ç»ªæ¢é-readiness)
  - [Service](#service)
    - [ClusterIP](#clusterip)
    - [NodePort](#nodeport)
    - [LoadBalancer](#loadbalancer)
  - [ingress](#ingress)
  - [Namespace](#namespace)
  - [Configmap](#configmap)
  - [Secret](#secret)
  - [Job](#job)
  - [CronJob](#cronjob)
  - [Helm](#helm)
    - [ç¨ helm å®è£ hellok8s](#ç¨-helm-å®è£-hellok8s)
    - [åå»º helm charts](#åå»º-helm-charts)
      - [rollback](#rollback)
      - [å¤ç¯å¢éç½®](#å¤ç¯å¢éç½®)
    - [helm chart æåååå¸](#helm-chart-æåååå¸)
  - [Dashboard](#dashboard)
    - [kubernetes dashboard](#kubernetes-dashboard)
    - [K9s](#k9s)
  - [Star History](#star-history)

# kubernetes tutorials

## åå¤å·¥ä½

å¨å¼å§æ¬æç¨ä¹åï¼éè¦éç½®å¥½æ¬å°ç¯å¢ï¼ä»¥ä¸æ¯éè¦å®è£çä¾èµååã

### å®è£ docker

é¦åæä»¬éè¦å®è£ `docker` æ¥æåéåï¼å¦æä½ æ¬å°å·²ç»å®è£äº `docker`ï¼é£ä¹ä½ å¯ä»¥éæ©è·³è¿è¿ä¸å°èã

#### æ¨èå®è£æ¹æ³

ç®åä½¿ç¨ [Docker Desktop](https://www.docker.com/products/docker-desktop/) æ¥å®è£ docker è¿æ¯æç®åçæ¹æ¡ï¼æå¼å®ç½ä¸è½½å¯¹åºä½ çµèæä½ç³»ç»çåå³å¯ (https://www.docker.com/products/docker-desktop/)ï¼

å½å®è£å®æåï¼å¯ä»¥éè¿ `docker run hello-world` æ¥å¿«éæ ¡éªæ¯å¦å®è£æåï¼

#### å¶å®å®è£æ¹æ³

ç®å  Docker å¬å¸å®£å¸  [Docker Desktop](https://www.docker.com/products/docker-desktop/) åªå¯¹ä¸ªäººå¼åèæèå°åå¢ä½åè´¹ (2021å¹´èµ·å¯¹å¤§åå¬å¸ä¸ååè´¹)ï¼æä»¥å¦æä½ ä¸è½éè¿  [Docker Desktop](https://www.docker.com/products/docker-desktop/) çæ¹å¼ä¸è½½å®è£ `docker`ï¼å¯ä»¥åè [è¿ç¯æç« ](https://dhwaneetbhatt.com/blog/run-docker-without-docker-desktop-on-macos) åªå®è£  [Docker CLI](https://github.com/docker/cli)ã

### å®è£ minikube

æä»¬è¿éè¦æ­å»ºä¸å¥ k8s æ¬å°éç¾¤ (ä½¿ç¨äºååæèå¶å® k8s éç¾¤é½å¯) ãæ¬å°æ­å»º k8s éç¾¤çæ¹å¼æ¨èä½¿ç¨ [minikube](https://minikube.sigs.k8s.io/docs/)ã

å¯ä»¥æ ¹æ® [minikube å¿«éå®è£](https://minikube.sigs.k8s.io/docs/start/) æ¥è¿è¡ä¸è½½å®è£ï¼è¿éç®ååä¸¾ MacOS çå®è£æ¹å¼ï¼Linux & Windows æä½ç³»ç»å¯ä»¥åè[å®æ¹ææ¡£](https://minikube.sigs.k8s.io/docs/start/) å¿«éå®è£ã

```shell
brew install minikube
```

#### å¯å¨ minikube

å ä¸º minikube æ¯æå¾å¤å®¹å¨åèæåææ¯ ([Docker](https://minikube.sigs.k8s.io/docs/drivers/docker/), [Hyperkit](https://minikube.sigs.k8s.io/docs/drivers/hyperkit/), [Hyper-V](https://minikube.sigs.k8s.io/docs/drivers/hyperv/), [KVM](https://minikube.sigs.k8s.io/docs/drivers/kvm2/), [Parallels](https://minikube.sigs.k8s.io/docs/drivers/parallels/), [Podman](https://minikube.sigs.k8s.io/docs/drivers/podman/), [VirtualBox](https://minikube.sigs.k8s.io/docs/drivers/virtualbox/), or [VMware Fusion/Workstation](https://minikube.sigs.k8s.io/docs/drivers/vmware/))ï¼ä¹æ¯é®é¢åºç°æ¯è¾å¤çå°æ¹ï¼æä»¥è¿éè¿æ¯ç¨å¾®è¯´æä¸ä¸ã

å¦æä½ ä½¿ç¨ `docker` çæ¹æ¡æ¯ä¸é¢æ¨èç [Docker Desktop](https://www.docker.com/products/docker-desktop/) ï¼é£ä¹ä½ ä»¥ä¸é¢çå½ä»¤å¯å¨ minikube å³å¯ï¼éè¦èå¿ç­å¾ä¸è½½ä¾èµã

```shell
minikube start --vm-driver docker --container-runtime=docker
```

å¯å¨å®æåï¼è¿è¡ `minikube status` æ¥çå½åç¶æç¡®å®æ¯å¦å¯å¨æåï¼

å¦æä½ æ¬å°åªæ Docker CLIï¼å¤æ­æ åå¦ææ§è¡ `docker ps` ç­å½ä»¤ï¼è¿åéè¯¯ `Cannot connect to the Docker daemon at unix:///Users/xxxx/.colima/docker.sock. Is the docker daemon running?` é£ä¹å°±éè¦æä½ä¸é¢çå½ä»¤ã

```shell
brew install hyperkit
minikube start --vm-driver hyperkit --container-runtime=docker

# Tell Docker CLI to talk to minikube's VM
eval $(minikube docker-env)

# Save IP to a hostname
echo "`minikube ip` docker.local" | sudo tee -a /etc/hosts > /dev/null

# Test
docker run hello-world
```

**minikube å½ä»¤éæ¥**

`minikube stop` ä¸ä¼å é¤ä»»ä½æ°æ®ï¼åªæ¯åæ­¢ VM å k8s éç¾¤ã

`minikube delete` å é¤ææ minikube å¯å¨åçæ°æ®ã

`minikube ip` æ¥çéç¾¤å docker enginer è¿è¡ç IP å°åã

`minikube pause` æåå½åçèµæºå k8s éç¾¤

`minikube status` æ¥çå½åéç¾¤ç¶æ

### å®è£ kubectl

è¿ä¸æ­¥æ¯å¯éçï¼å¦æä¸å®è£çè¯ï¼åç»­ææ `kubectl` ç¸å³çå½ä»¤ï¼ä½¿ç¨ `minikube kubectl` å½ä»¤æ¿ä»£å³å¯ã

å¦æä½ ä¸æ³ä½¿ç¨ `minikube kubectl` æèéç½®ç¸å³ç¯å¢åéæ¥è¿è¡ä¸é¢çæå­¦çè¯ï¼å¯ä»¥èèç´æ¥å®è£ `kubectl`ã

```shell
brew install kubectl
```

### æ³¨å docker hub è´¦å·ç»å½

å ä¸ºé»è®¤ minikube ä½¿ç¨çéåå°åæ¯ DockerHubï¼æä»¥æä»¬è¿éè¦å¨ DockerHub (https://hub.docker.com/) ä¸­æ³¨åè´¦å·ï¼å¹¶ä¸ä½¿ç¨ login å½ä»¤ç»å½è´¦å·ã

```shell
docker login
```

## Container

æä»¬çæç¨ä»ä¸æ®µä»£ç å¼å§ãæ°å»ºä¸ä¸ª `main.go` æä»¶ï¼å¤å¶ä¸é¢çä»£ç å°æä»¶ä¸­ã

```go
package main

import (
	"io"
	"net/http"
)

func hello(w http.ResponseWriter, r *http.Request) {
	io.WriteString(w, "[v1] Hello, Kubernetes!")
}

func main() {
	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

ä¸é¢æ¯ä¸ä¸²ç¨ [Go](https://go.dev/) åçä»£ç ï¼ä»£ç é»è¾éå¸¸çç®åï¼é¦åå¯å¨ HTTP æå¡å¨ï¼çå¬ `3000` ç«¯å£ï¼å½è®¿é®è·¯ç± `/`çæ¶å è¿åå­ç¬¦ä¸² `[v1] Hello, Kubernetes!`ã

å¨ä»¥åï¼å¦æä½ æ³å°è¿æ®µä»£ç è¿è¡èµ·æ¥å¹¶æµè¯ä¸ä¸ãä½ é¦åéè¦æå¾å¦ä½ä¸è½½ golang çå®è£åè¿è¡å®è£ï¼æ¥çéè¦æå¾ `golang module` çåºæ¬ä½¿ç¨ï¼æåè¿éè¦äºè§£ golang çç¼è¯åè¿è¡å½ä»¤ï¼æè½å°è¯¥ä»£ç è¿è¡èµ·æ¥ãçè³å¨è¿ç¨ä¸­ï¼å¯è½ä¼å ä¸ºç¯å¢åéé®é¢ãæä½ç³»ç»é®é¢ãå¤çå¨æ¶æç­é®é¢å¯¼è´ç¼è¯æè¿è¡å¤±è´¥ã

ä½æ¯éè¿ Container (å®¹å¨) ææ¯ï¼åªéè¦ä¸é¢çä»£ç ï¼éå¸¦çå¯¹åºçå®¹å¨ `Dockerfile` æä»¶ï¼é£ä¹ä½ å°±ä¸éè¦ golang çä»»ä½ç¥è¯ï¼ä¹è½å°ä»£ç é¡ºå©è¿è¡èµ·æ¥ã

> Container (å®¹å¨) æ¯ä¸ç§æ²çææ¯ãå®æ¯åºäº Linux ä¸­ Namespace / Cgroups / chroot ç­ææ¯ç»åèæï¼æ´å¤ææ¯ç»èå¯ä»¥åç§è¿ä¸ªè§é¢ [å¦ä½èªå·±å®ç°ä¸ä¸ªå®¹å¨](https://www.youtube.com/watch?v=8fi7uSYlOdc)ã

ä¸é¢å°±æ¯ Go ä»£ç å¯¹åºç `Dockerfile`ï¼ç®åçæ¹æ¡æ¯ç´æ¥ä½¿ç¨ golang ç alpine éåæ¥æåï¼ä½æ¯å ä¸ºæä»¬åç»­ç»ä¹ éè¦é¢ç¹çæ¨ééåå° DockerHub åæåéåå° k8s éç¾¤ä¸­ï¼ä¸ºäºä¼åç½ç»éåº¦ï¼æä»¬éæ©åå¨ `golang:1.16-buster` ä¸­å°ä¸è¿° Go ä»£ç ç¼è¯æäºè¿å¶æä»¶ï¼åå°äºè¿å¶æä»¶å¤å¶å° `base-debian10` éåä¸­è¿è¡ (Dockerfile ä¸çè§£æ²¡æå³ç³»ï¼ä¸å½±ååç»­å­¦ä¹ )ã

è¿æ ·æä»¬å¯ä»¥å° 300MB å¤§å°çéååæåªæ 20MB çéåï¼çè³åç¼©ä¸ä¼ å° DockerHub åå¤§å°åªæ 10MBï¼

```dockerfile
# Dockerfile
FROM golang:1.16-buster AS builder
RUN mkdir /src
ADD . /src
WORKDIR /src

RUN go env -w GO111MODULE=auto
RUN go build -o main .

FROM gcr.io/distroless/base-debian10

WORKDIR /

COPY --from=builder /src/main /main
EXPOSE 3000
ENTRYPOINT ["/main"]
```

éè¦æ³¨æ `main.go` æä»¶éè¦å `Dockerfile` æä»¶å¨åä¸ä¸ªç®å½ä¸ï¼æ§è¡ä¸æ¹ `docker build` å½ä»¤ï¼ç¬¬ä¸æ¬¡éè¦èå¿ç­å¾æååºç¡éåãå¹¶ä¸**éè¦æ³¨æå°å½ä»¤ä¸­ `guangzhengli` æ¿æ¢æèªå·±ç `DockerHub` æ³¨åçè´¦å·åç§°**ã è¿æ ·æä»¬åç»­å¯ä»¥æ¨ééåå°èªå·±æ³¨åç  `DockerHub` ä»åºå½ä¸­ã

```shell
docker build . -t guangzhengli/hellok8s:v1
# Step 1/11 : FROM golang:1.16-buster AS builder
# ...
# ...
# Step 11/11 : ENTRYPOINT ["/main"]
# Successfully tagged guangzhengli/hellok8s:v1


docker images
# guangzhengli/hellok8s          v1         f956e8cf7d18   8 days ago      25.4MB
```

 `docker build`  å½ä»¤å®æåæä»¬å¯ä»¥éè¿ `docker images` å½ä»¤æ¥çéåæ¯å¦ build æåï¼æåæä»¬æ§è¡ `docker run` å½ä»¤å°å®¹å¨å¯å¨ï¼ `-p` æå® `3000` ä½ä¸ºç«¯å£ï¼`-d` æå®åæåæåçéååç§°ã

```shell
docker run -p 3000:3000 --name hellok8s -d guangzhengli/hellok8s:v1
```

è¿è¡æååï¼å¯ä»¥éè¿æµè§å¨æè `curl` æ¥è®¿é® `http://127.0.0.1:3000` , æ¥çæ¯å¦æåè¿åå­ç¬¦ä¸² `[v1] Hello, Kubernetes!`ã

è¿éå ä¸ºææ¬å°åªç¨ Docker CLIï¼è docker runtime æ¯ä½¿ç¨ `minikube`ï¼æä»¥æéè¦åè°ç¨  `minikube ip` æ¥è¿å minikube IP å°åï¼ä¾å¦è¿åäº `192.168.59.100`ï¼æä»¥æéè¦è®¿é®  `http://192.168.59.100:3000` æ¥å¤æ­æ¯å¦æåè¿åå­ç¬¦ä¸² `[v1] Hello, Kubernetes!`ã

æåç¡®è®¤æ²¡æé®é¢ï¼ä½¿ç¨ `docker push` å°éåä¸ä¼ å°è¿ç¨ç `DockerHub` ä»åºå½ä¸­ï¼è¿æ ·å¯ä»¥ä¾ä»äººä¸è½½ä½¿ç¨ï¼ä¹æ¹ä¾¿åç»­  `Minikube` ä¸è½½éåä½¿ç¨ã  **éè¦æ³¨æå° `guangzhengli` æ¿æ¢æèªå·±ç `DockerHub` è´¦å·åç§°**ã

```shell
docker push guangzhengli/hellok8s:v1
```

ç»è¿è¿ä¸èçç»ä¹ ï¼ææ²¡æå¯¹å®¹å¨çå¼ºå¤§æä¸ä¸ªåæ­¥çè®¤è¯å¢ï¼å¯ä»¥æ³è±¡å½ä½ æ³é¨ç½²ä¸ä¸ªæ´å¤æçæå¡æ¶ï¼ä¾å¦ Nginxï¼MySQLï¼Redisãä½ åªéè¦å° [DockerHub æç´¢](https://hub.docker.com/search?q=) ä¸­æç´¢å¯¹åºçéåï¼éè¿ `docker pull` ä¸è½½éåï¼`docker run` å¯å¨æå¡å³å¯ï¼èæ éå³å¿ä¾èµååç§éç½®ï¼

## Pod

å¦æå¨çäº§ç¯å¢ä¸­è¿è¡çé½æ¯ç¬ç«çåä½æå¡ï¼é£ä¹ Container (å®¹å¨) ä¹å°±å¤ç¨äºï¼ä½æ¯å¨å®éççäº§ç¯å¢ä¸­ï¼ç»´æ¤çå¤§è§æ¨¡çéç¾¤ååç§ä¸åçæå¡ï¼æå¡ä¹é´å¾å¾å­å¨çåç§åæ ·çå³ç³»ãèè¿äºå³ç³»çå¤çï¼ææ¯æå¨ç®¡çæå°é¾çå°æ¹ã

**Pod** æ¯æä»¬å°è¦åå»ºçç¬¬ä¸ä¸ª k8s èµæºï¼ä¹æ¯å¯ä»¥å¨ Kubernetes ä¸­åå»ºåç®¡ççãæå°çå¯é¨ç½²çè®¡ç®ååãå¨äºè§£ `pod` å  `container` çåºå«ä¹åï¼æä»¬å¯ä»¥ååå»ºä¸ä¸ªç®åç pod è¯è¯ï¼  

æä»¬ååå»º `nginx.yaml` æä»¶ï¼ç¼åä¸ä¸ªå¯ä»¥åå»º `nginx` ç Podã

```yaml
# nginx.yaml
apiVersion: v1
kind: Pod
metadata:
  name: nginx-pod
spec:
  containers:
    - name: nginx-container
      image: nginx
```

å¶ä¸­  `kind` è¡¨ç¤ºæä»¬è¦åå»ºçèµæºæ¯ `Pod` ç±»åï¼  `metadata.name` è¡¨ç¤ºè¦åå»ºç pod çåå­ï¼è¿ä¸ªåå­éè¦æ¯å¯ä¸çã   `spec.containers` è¡¨ç¤ºè¦è¿è¡çå®¹å¨çåç§°åéååç§°ãéåé»è®¤æ¥æº `DockerHub`ã

æä»¬è¿è¡ç¬¬ä¸æ¡ k8s å½ä»¤ `kubectl apply -f nginx.yaml` å½ä»¤æ¥åå»º `nginx`  Podã

æ¥çéè¿ `kubectl get pods` æ¥æ¥ç pod æ¯å¦æ­£å¸¸å¯å¨ã

æåéè¿ `kubectl port-forward nginx-pod 4000:80` å½ä»¤å° `nginx` é»è®¤ç `80` ç«¯å£æ å°å°æ¬æºç `4000` ç«¯å£ï¼æå¼æµè§å¨æè `curl` æ¥è®¿é® `http://127.0.0.1:4000` , æ¥çæ¯å¦æåè®¿é® `nginx` é»è®¤é¡µé¢ï¼

``` shell
kubectl apply -f nginx.yaml        
# pod/nginx-pod created

kubectl get pods
# nginx-pod         1/1     Running   0           6s

kubectl port-forward nginx-pod 4000:80
# Forwarding from 127.0.0.1:4000 -> 80
# Forwarding from [::1]:4000 -> 80
```

`kubectl exec -it` å¯ä»¥ç¨æ¥è¿å¥ Pod åå®¹å¨ç Shellãéè¿å½ä»¤ä¸é¢çå½ä»¤æ¥éç½® `nginx` çé¦é¡µåå®¹ã

```shell
kubectl exec -it nginx-pod /bin/bash

echo "hello kubernetes by nginx!" > /usr/share/nginx/html/index.html

kubectl port-forward nginx-pod 4000:80
```

æåå¯ä»¥éè¿æµè§å¨æè `curl` æ¥è®¿é® `http://127.0.0.1:4000` , æ¥çæ¯å¦æåå¯å¨ `nginx` åè¿åå­ç¬¦ä¸² `hello kubernetes by nginx!`ã

### Pod ä¸ Container çä¸å

åå° `pod` å  `container` çåºå«ï¼æä»¬ä¼åç°åååå»ºåºæ¥çèµæºå¦ä¸å¾æç¤ºï¼å¨æåå±æ¯æä»¬çæå¡ `nginx`ï¼è¿è¡å¨ `container` å®¹å¨å½ä¸­ï¼ `container` (å®¹å¨) çæ¬è´¨æ¯è¿ç¨ï¼è `pod` æ¯ç®¡çè¿ä¸ç»è¿ç¨çèµæºã

![nginx_pod](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/nginx_pod.png)

æä»¥èªç¶ `pod` å¯ä»¥ç®¡çå¤ä¸ª `container`ï¼å¨æäºåºæ¯ä¾å¦æå¡ä¹é´éè¦æä»¶äº¤æ¢(æ¥å¿æ¶é)ï¼æ¬å°ç½ç»éä¿¡éæ±(ä½¿ç¨ localhost æè Socket æä»¶è¿è¡æ¬å°éä¿¡)ï¼å¨è¿äºåºæ¯ä¸­ä½¿ç¨ `pod` ç®¡çå¤ä¸ª `container` å°±éå¸¸çæ¨èãèè¿ï¼ä¹æ¯ k8s å¦ä½å¤çæå¡ä¹é´å¤æå³ç³»çç¬¬ä¸ä¸ªä¾å­ï¼å¦ä¸å¾æç¤ºï¼

![pod](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/pod.png)

### Pod å¶å®å½ä»¤

æä»¬å¯ä»¥éè¿ `logs` æè `logs -f` å½ä»¤æ¥ç pod æ¥å¿ï¼å¯ä»¥éè¿ `exec -it` è¿å¥ pod æèè°ç¨å®¹å¨å½ä»¤ï¼éè¿ `delete pod` æè  `delete -f nginx.yaml` çæ¹å¼å é¤ pod èµæºãè¿éå¯ä»¥çå° [kubectl ææå½ä»¤](https://kubernetes.io/docs/reference/kubectl/cheatsheet/)ã

```shell
kubectlÂ logsÂ --followÂ nginx-pod
Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â Â 
kubectl exec nginx-pod -- ls

kubectl delete pod nginx-pod
# pod "nginx-pod" deleted

kubectl delete -f nginx.yaml
# pod "nginx-pod" deleted
```

æåï¼æ ¹æ®æä»¬å¨ `container` çé£èæå»ºç `hellok8s:v1` çéåï¼åæ¶åè `nginx` pod çèµæºå®ä¹ï¼ä½ è½ç¬èªç¼ååº  `hellok8s:v1`  Pod çèµæºæä»¶åãå¹¶éè¿ `port-forward` å°æ¬å°ç `3000` ç«¯å£è¿è¡è®¿é®ï¼æç»å¾å°å­ç¬¦ä¸² `[v1] Hello, Kubernetes!`ã

`hellok8s:v1` Pod èµæºå®ä¹åç¸åºçå½ä»¤å¦ä¸æç¤ºï¼

```yaml
# hellok8s.yaml
apiVersion: v1
kind: Pod
metadata:
  name: hellok8s
spec:
  containers:
    - name: hellok8s-container
      image: guangzhengli/hellok8s:v1
```

```shell
kubectl apply -f hellok8s.yaml

kubectl get pods

kubectl port-forward hellok8s 3000:3000
```

## Deployment

å¨çäº§ç¯å¢ä¸­ï¼æä»¬åºæ¬ä¸ä¸ä¼ç´æ¥ç®¡ç podï¼æä»¬éè¦ `kubernetes` æ¥å¸®å©æä»¬æ¥å®æä¸äºèªå¨åæä½ï¼ä¾å¦èªå¨æ©å®¹æèèªå¨åçº§çæ¬ãå¯ä»¥æ³è±¡å¨çäº§ç¯å¢ä¸­ï¼æä»¬æå¨é¨ç½²äº 10 ä¸ª `hellok8s:v1` ç podï¼è¿ä¸ªæ¶åæä»¬éè¦åçº§æ `hellok8s:v2` çæ¬ï¼æä»¬é¾ééè¦ä¸ä¸ªä¸ä¸ªçå° `hellok8s:v1` ç pod æå¨åçº§åï¼

è¿ä¸ªæ¶åå°±éè¦æä»¬æ¥ç `kubernetes` çå¦å¤ä¸ä¸ªèµæº `deployment`ï¼æ¥å¸®å©æä»¬ç®¡ç podã

### æ©å®¹

é¦åå¯ä»¥åå»ºä¸ä¸ª `deployment.yaml` çæä»¶ãæ¥ç®¡ç `hellok8s` podã

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  replicas: 1
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: guangzhengli/hellok8s:v1
          name: hellok8s-container
```

å¶ä¸­  `kind` è¡¨ç¤ºæä»¬è¦åå»ºçèµæºæ¯ `deployment` ç±»åï¼  `metadata.name` è¡¨ç¤ºè¦åå»ºç deployment çåå­ï¼è¿ä¸ªåå­éè¦æ¯**å¯ä¸**çã

å¨ `spec` éé¢è¡¨ç¤ºï¼é¦å `replicas` è¡¨ç¤ºçæ¯é¨ç½²ç pod å¯æ¬æ°éï¼`selector` éé¢è¡¨ç¤ºçæ¯ `deployment` èµæºå `pod` èµæºå³èçæ¹å¼ï¼è¿éè¡¨ç¤º `deployment` ä¼ç®¡ç (selector) ææ `labels=hellok8s` ç podã

`template` çåå®¹æ¯ç¨æ¥å®ä¹ `pod` èµæºçï¼ä½ ä¼åç°å Hellok8s Pod èµæºçå®ä¹æ¯å·®ä¸å¤çï¼å¯ä¸çåºå«æ¯æä»¬éè¦å ä¸ `metadata.labels` æ¥åä¸é¢ç `selector.matchLabels` å¯¹åºèµ·æ¥ãæ¥è¡¨æ pod æ¯è¢« deployment ç®¡çï¼ä¸ç¨å¨`template` éé¢å ä¸ `metadata.name` æ¯å ä¸º deployment ä¼èªå¨ä¸ºæä»¬åå»º pod çå¯ä¸`name`ã

æ¥ä¸æ¥è¾å¥ä¸é¢çå½ä»¤ï¼å¯ä»¥åå»º `deployment` èµæºãéè¿ `get` å `delete pod` å½ä»¤ï¼æä»¬ä¼åæ­¥æå deployment çé­åã**æ¯æ¬¡åå»ºç pod åç§°é½ä¼ååï¼æäºå½ä»¤è®°å¾æ¿æ¢æä½ ç pod çåç§°**

```shell
kubectl apply -f deployment.yaml

kubectl get deployments
#NAME                  READY   UP-TO-DATE   AVAILABLE   AGE
#hellok8s-deployment   1/1     1            1           39s

kubectl get pods             
#NAME                                   READY   STATUS    RESTARTS   AGE
#hellok8s-deployment-77bffb88c5-qlxss   1/1     Running   0          119s

kubectl delete pod hellok8s-deployment-77bffb88c5-qlxss 
#pod "hellok8s-deployment-77bffb88c5-qlxss" deleted

kubectl get pods                                       
#NAME                                   READY   STATUS    RESTARTS   AGE
#hellok8s-deployment-77bffb88c5-xp8f7   1/1     Running   0          18s
```

æä»¬ä¼åç°ä¸ä¸ªæè¶£çç°è±¡ï¼å½æå¨å é¤ä¸ä¸ª `pod` èµæºåï¼deployment ä¼èªå¨åå»ºä¸ä¸ªæ°ç `pod`ï¼è¿åæä»¬ä¹åæå¨åå»º pod èµæºææ¬è´¨çåºå«ï¼è¿ä»£è¡¨çå½çäº§ç¯å¢ç®¡ççæåä¸ä¸ä¸ª pod æ¶ï¼æä»¬ä¸éè¦å³å¿å·ä½çæåµï¼åªéè¦ç»´æ¤å¥½è¿ä»½ `deployment.yaml` æä»¶çèµæºå®ä¹å³å¯ã

æ¥ä¸æ¥æä»¬éè¿èªå¨æ©å®¹æ¥å æ·±è¿ä¸ªç¥è¯ç¹ï¼å½æä»¬æ³è¦å° `hellok8s:v1` çèµæºæ©å®¹å° 3 ä¸ªå¯æ¬æ¶ï¼åªéè¦å° `replicas` çå¼è®¾ç½®æ 3ï¼æ¥çéæ°è¾å¥ `kubectl apply -f deployment.yaml` å³å¯ãå¦ä¸æç¤ºï¼

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  replicas: 3
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: guangzhengli/hellok8s:v1
          name: hellok8s-container
```

å¯ä»¥å¨ `kubectl apply` ä¹åéè¿æ°å»ºçªå£æ§è¡ `kubectl get pods --watch` å½ä»¤æ¥è§å¯ pod å¯å¨åå é¤çè®°å½ï¼æ³è¦åå°å¯æ¬æ°æ¶ä¹å¾ç®åï¼ä½ å¯ä»¥å°è¯å°å¯æ¬æ°éæå¢å¤§æèç¼©å°ï¼åéè¿ `watch` æ¥è§å¯å®çç¶æã

![deployment](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/deployment.png)

### åçº§çæ¬

æä»¬æ¥ä¸æ¥å°è¯å°ææ `v1` çæ¬ç `pod` åçº§å° `v2` çæ¬ãé¦åæä»¬éè¦æå»ºä¸ä»½ `hellok8s:v2` ççæ¬éåãå¯ä¸çåºå«å°±æ¯å­ç¬¦ä¸²æ¿æ¢æäº `[v2] Hello, Kubernetes!`ã

```go
package main

import (
	"io"
	"net/http"
)

func hello(w http.ResponseWriter, r *http.Request) {
	io.WriteString(w, "[v2] Hello, Kubernetes!")
}

func main() {
	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

å° `hellok8s:v2` æ¨å° DockerHub ä»åºä¸­ã

```shell
docker build . -t guangzhengli/hellok8s:v2
docker push guangzhengli/hellok8s:v2
```

æ¥çç¼å `v2` çæ¬ç deployment èµæºæä»¶ã

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  replicas: 3
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: guangzhengli/hellok8s:v2
          name: hellok8s-container
```

```shell
kubectl apply -f deployment.yaml
# deployment.apps/hellok8s-deployment configured

kubectl get pods                
# NAME                                   READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-66799848c4-kpc6q   1/1     Running   0          3s
# hellok8s-deployment-66799848c4-pllj6   1/1     Running   0          3s
# hellok8s-deployment-66799848c4-r7qtg   1/1     Running   0          3s

kubectl port-forward hellok8s-deployment-66799848c4-kpc6q 3000:3000
# Forwarding from 127.0.0.1:3000 -> 3000
# Forwarding from [::1]:3000 -> 3000

# open another terminal
curl http://localhost:3000
# [v2] Hello, Kubernetes!
```

ä½ ä¹å¯ä»¥è¾å¥ `kubectl describe pod hellok8s-deployment-66799848c4-kpc6q` æ¥çæ¯å¦æ¯ `v2` çæ¬çéåã

### Rolling Update(æ»å¨æ´æ°)

å¦ææä»¬å¨çäº§ç¯å¢ä¸ï¼ç®¡ççå¤ä¸ªå¯æ¬ç `hellok8s:v1` çæ¬ç podï¼æä»¬éè¦æ´æ°å° `v2` ççæ¬ï¼åä¸é¢é£æ ·çé¨ç½²æ¹å¼æ¯å¯ä»¥çï¼ä½æ¯ä¹ä¼å¸¦æ¥ä¸ä¸ªé®é¢ï¼å°±æ¯ææçå¯æ¬å¨åä¸æ¶é´æ´æ°ï¼è¿ä¼å¯¼è´æä»¬ `hellok8s` æå¡å¨ç­æ¶é´åæ¯ä¸å¯ç¨çï¼å ä¸ºææ pod é½å¨åçº§å° `v2` çæ¬çè¿ç¨ä¸­ï¼éè¦ç­å¾æä¸ª pod åçº§å®æåæè½æä¾æå¡ã

è¿ä¸ªæ¶åæä»¬å°±éè¦æ»å¨æ´æ° (rolling update)ï¼å¨ä¿è¯æ°çæ¬ `v2` ç pod è¿æ²¡æ `ready` ä¹åï¼åä¸å é¤ `v1` çæ¬ç podã

å¨ deployment çèµæºå®ä¹ä¸­, `spec.strategy.type` æä¸¤ç§éæ©:

- **RollingUpdate:** éæ¸å¢å æ°çæ¬ç podï¼éæ¸åå°æ§çæ¬ç podã
- **Recreate:** å¨æ°çæ¬ç pod å¢å åï¼åå°æææ§çæ¬ pod å é¤ã

å¤§å¤æ°æåµä¸æä»¬ä¼éç¨æ»å¨æ´æ° (RollingUpdate) çæ¹å¼ï¼æ»å¨æ´æ°åå¯ä»¥éè¿ `maxSurge` å `maxUnavailable` å­æ®µæ¥æ§å¶åçº§ pod çéçï¼å·ä½å¯ä»¥è¯¦ç»ç[å®ç½å®ä¹](https://kubernetes.io/zh-cn/docs/concepts/workloads/controllers/deployment/)ãï¼

- [**maxSurge:**](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#max-surge) æå¤§å³°å¼ï¼ç¨æ¥æå®å¯ä»¥åå»ºçè¶åºææ Pod ä¸ªæ°ç Pod æ°éã
- [**maxUnavailable:**](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/#max-unavailable,) æå¤§ä¸å¯ç¨ï¼ç¨æ¥æå®æ´æ°è¿ç¨ä¸­ä¸å¯ç¨ç Pod çä¸ªæ°ä¸éã

æä»¬åè¾å¥å½ä»¤åæ»æä»¬ç deploymentï¼è¾å¥ `kubectl describe pod` ä¼åç° deployment å·²ç»æ `v2` çæ¬ç pod åæ»å° ` v1` ççæ¬ã

``` shell
kubectlÂ rolloutÂ undoÂ deploymentÂ hellok8s-deployment

kubectl get pods                                    
# NAME                                   READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-77bffb88c5-cvm5c   1/1     Running   0          39s
# hellok8s-deployment-77bffb88c5-lktbl   1/1     Running   0          41s
# hellok8s-deployment-77bffb88c5-nh82z   1/1     Running   0          37s

kubectl describe pod hellok8s-deployment-77bffb88c5-cvm5c
# Image: guangzhengli/hellok8s:v1
```

é¤äºä¸é¢çå½ä»¤ï¼è¿å¯ä»¥ç¨ `history` æ¥æ¥çåå²çæ¬ï¼`--to-revision=2` æ¥åæ»å°æå®çæ¬ã

```shell
kubectl rollout history deployment hellok8s-deployment
kubectl rollout undo deployment/hellok8s-deployment --to-revision=2
```

æ¥çè®¾ç½® `strategy=rollingUpdate` , `maxSurge=1` , `maxUnavailable=1` å `replicas=3`  å° deployment.yaml æä»¶ä¸­ãè¿ä¸ªåæ°éç½®æå³çæå¤§å¯è½ä¼åå»º 4 ä¸ª hellok8s pod (replicas + maxSurge)ï¼æå°ä¼æ 2 ä¸ª hellok8s pod å­æ´» (replicas - maxUnavailable)ã

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  strategy:
     rollingUpdate:
      maxSurge: 1
      maxUnavailable: 1
  replicas: 3
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
      - image: guangzhengli/hellok8s:v2
        name: hellok8s-container
```

ä½¿ç¨ `kubectl apply -f deployment.yaml` æ¥éæ°åå»º `v2` çèµæºï¼å¯ä»¥éè¿ `kubectl get pods --watch` æ¥è§å¯ pod çåå»ºéæ¯æåµï¼æ¯å¦å¦ä¸å¾æç¤ºã

![rollingupdate](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/rollingupdate.png)

### å­æ´»æ¢é (livenessProb)

> å­æ´»æ¢æµå¨æ¥ç¡®å®ä»ä¹æ¶åè¦éå¯å®¹å¨ã ä¾å¦ï¼å­æ´»æ¢æµå¨å¯ä»¥æ¢æµå°åºç¨æ­»éï¼åºç¨ç¨åºå¨è¿è¡ï¼ä½æ¯æ æ³ç»§ç»­æ§è¡åé¢çæ­¥éª¤ï¼æåµã éå¯è¿ç§ç¶æä¸çå®¹å¨æå©äºæé«åºç¨çå¯ç¨æ§ï¼å³ä½¿å¶ä¸­å­å¨ç¼ºé·ã-- [LivenessProb](https://kubernetes.io/docs/tasks/configure-pod-container/configure-liveness-readiness-startup-probes/)

å¨çäº§ä¸­ï¼ææ¶åå ä¸ºæäº bug å¯¼è´åºç¨æ­»éæèçº¿ç¨èå°½äºï¼æç»ä¼å¯¼è´åºç¨æ æ³ç»§ç»­æä¾æå¡ï¼è¿ä¸ªæ¶åå¦ææ²¡æææ®µæ¥èªå¨çæ§åå¤çè¿ä¸é®é¢çè¯ï¼å¯è½ä¼å¯¼è´å¾é¿ä¸æ®µæ¶é´æ äººåç°ã[kubelet](https://kubernetes.io/docs/reference/command-line-tools-reference/kubelet/) ä½¿ç¨å­æ´»æ¢æµå¨ (livenessProb) æ¥ç¡®å®ä»ä¹æ¶åè¦éå¯å®¹å¨ã

æ¥ä¸æ¥æä»¬åä¸ä¸ª `/healthz` æ¥å£æ¥è¯´æ `livenessProb` å¦ä½ä½¿ç¨ã `/healthz` æ¥å£ä¼å¨å¯å¨æåç 15s åæ­£å¸¸è¿å 200 ç¶æç ï¼å¨ 15s åï¼ä¼ä¸ç´è¿å 500 çç¶æç ã

```go
package main

import (
	"fmt"
	"io"
	"net/http"
	"time"
)

func hello(w http.ResponseWriter, r *http.Request) {
	io.WriteString(w, "[v2] Hello, Kubernetes!")
}

func main() {
	started := time.Now()
	http.HandleFunc("/healthz", func(w http.ResponseWriter, r *http.Request) {
		duration := time.Since(started)
		if duration.Seconds() > 15 {
			w.WriteHeader(500)
			w.Write([]byte(fmt.Sprintf("error: %v", duration.Seconds())))
		} else {
			w.WriteHeader(200)
			w.Write([]byte("ok"))
		}
	})

	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

```yaml
# Dockerfile
FROM golang:1.16-buster AS builder
RUN mkdir /src
ADD . /src
WORKDIR /src

RUN go env -w GO111MODULE=auto
RUN go build -o main .

FROM gcr.io/distroless/base-debian10

WORKDIR /

COPY --from=builder /src/main /main
EXPOSE 3000
ENTRYPOINT ["/main"]
```

`Dockerfile` çç¼åååæ¥ä¿æä¸è´ï¼æä»¬æ `tag` ä¿®æ¹ä¸º `liveness` å¹¶æ¨éå°è¿ç¨ä»åºã

```shell
docker build . -t guangzhengli/hellok8s:liveness
docker push guangzhengli/hellok8s:liveness
```

æåç¼å deployment çå®ä¹ï¼è¿éä½¿ç¨å­æ´»æ¢æµæ¹å¼æ¯ä½¿ç¨ HTTP GET è¯·æ±ï¼è¯·æ±çæ¯åæå®ä¹ç `/healthz` æ¥å£ï¼`periodSeconds` å­æ®µæå®äº kubelet æ¯é 3 ç§æ§è¡ä¸æ¬¡å­æ´»æ¢æµã `initialDelaySeconds` å­æ®µåè¯ kubelet å¨æ§è¡ç¬¬ä¸æ¬¡æ¢æµååºè¯¥ç­å¾ 3 ç§ãå¦ææå¡å¨ä¸ `/healthz` è·¯å¾ä¸çå¤çç¨åºè¿åæåä»£ç ï¼å kubelet è®¤ä¸ºå®¹å¨æ¯å¥åº·å­æ´»çã å¦æå¤çç¨åºè¿åå¤±è´¥ä»£ç ï¼å kubelet ä¼ææ­»è¿ä¸ªå®¹å¨å¹¶å°å¶éå¯ã

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  strategy:
     rollingUpdate:
      maxSurge: 1
      maxUnavailable: 1
  replicas: 3
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: guangzhengli/hellok8s:liveness
          name: hellok8s-container
          livenessProbe:
            httpGet:
              path: /healthz
              port: 3000
            initialDelaySeconds: 3
            periodSeconds: 3
```

éè¿ `get` æè `describe` å½ä»¤å¯ä»¥åç° pod ä¸ç´å¤äºéå¯å½ä¸­ã

```shell
kubectl apply -f deployment.yaml

kubectl get pods
# NAME                                   READY   STATUS    RESTARTS     AGE
# hellok8s-deployment-5995ff9447-d5fbz   1/1     Running   4 (6s ago)   102s
# hellok8s-deployment-5995ff9447-gz2cx   1/1     Running   4 (5s ago)   101s
# hellok8s-deployment-5995ff9447-rh29x   1/1     Running   4 (6s ago)   102s

kubectl describe pod hellok8s-68f47f657c-zwn6g

# ...
# ...
# ...
# Events:
#  Type     Reason     Age                   From               Message
#  ----     ------     ----                  ----               -------
#  Normal   Scheduled  12m                   default-scheduler  Successfully assigned default/hellok8s-deployment-5995ff9447-rh29x to minikube
#  Normal   Pulled     11m (x4 over 12m)     kubelet            Container image "guangzhengli/hellok8s:liveness" already present on machine
#  Normal   Created    11m (x4 over 12m)     kubelet            Created container hellok8s-container
#  Normal   Started    11m (x4 over 12m)     kubelet            Started container hellok8s-container
#  Normal   Killing    11m (x3 over 12m)     kubelet            Container hellok8s-container failed liveness probe, will be restarted
#  Warning  Unhealthy  11m (x10 over 12m)    kubelet            Liveness probe failed: HTTP probe failed with statuscode: 500
#  Warning  BackOff    2m41s (x36 over 10m)  kubelet            Back-off restarting failed container
```

### å°±ç»ªæ¢é (readiness)

> å°±ç»ªæ¢æµå¨å¯ä»¥ç¥éå®¹å¨ä½æ¶åå¤å¥½æ¥åè¯·æ±æµéï¼å½ä¸ä¸ª Pod åçææå®¹å¨é½å°±ç»ªæ¶ï¼æè½è®¤ä¸ºè¯¥ Pod å°±ç»ªã è¿ç§ä¿¡å·çä¸ä¸ªç¨éå°±æ¯æ§å¶åªä¸ª Pod ä½ä¸º Service çåç«¯ã è¥ Pod å°æªå°±ç»ªï¼ä¼è¢«ä» Service çè´è½½åè¡¡å¨ä¸­åé¤ã-- [ReadinessProb](https://kubernetes.io/docs/tasks/configure-pod-container/configure-liveness-readiness-startup-probes/)

å¨çäº§ç¯å¢ä¸­ï¼åçº§æå¡ççæ¬æ¯æ¥å¸¸çéæ±ï¼è¿æ¶æä»¬éè¦èèä¸ç§åºæ¯ï¼å³å½åå¸ççæ¬å­å¨é®é¢ï¼å°±ä¸åºè¯¥è®©å®åçº§æåãkubelet ä½¿ç¨å°±ç»ªæ¢æµå¨å¯ä»¥ç¥éå®¹å¨ä½æ¶åå¤å¥½æ¥åè¯·æ±æµéï¼å½ä¸ä¸ª pod åçº§åä¸è½å°±ç»ªï¼å³ä¸åºè¯¥è®©æµéè¿å¥è¯¥ podï¼å¨éå `rollingUpate` çåè½ä¸ï¼ä¹ä¸è½åè®¸åçº§çæ¬ç»§ç»­ä¸å»ï¼å¦åæå¡ä¼åºç°å¨é¨åçº§å®æï¼å¯¼è´æææå¡åä¸å¯ç¨çæåµã

è¿éæä»¬ææå¡åæ»å° `hellok8s:v2` ççæ¬ï¼å¯ä»¥éè¿ä¸é¢å­¦ä¹ çæ¹æ³è¿è¡åæ»ã

```shell
kubectl rollout undo deployment hellok8s-deployment --to-revision=2
```

è¿éæä»¬å°åºç¨ç `/healthz` æ¥å£ç´æ¥è®¾ç½®æè¿å 500 ç¶æç ï¼ä»£è¡¨è¯¥çæ¬æ¯ä¸ä¸ªæé®é¢ççæ¬ã

```go
package main

import (
	"io"
	"net/http"
)

func hello(w http.ResponseWriter, r *http.Request) {
	io.WriteString(w, "[v2] Hello, Kubernetes!")
}

func main() {
	http.HandleFunc("/healthz", func(w http.ResponseWriter, r *http.Request) {
			w.WriteHeader(500)
	})

	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

å¨ `build` é¶æ®µæä»¬å° `tag` è®¾ç½®ä¸º `bad`ï¼æåå push å°è¿ç¨ä»åºã

``` shell
docker build . -t guangzhengli/hellok8s:bad

docker push guangzhengli/hellok8s:bad
```

æ¥çç¼å deployment èµæºæä»¶ï¼[Probe](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.25/#probe-v1-core) æå¾å¤éç½®å­æ®µï¼å¯ä»¥ä½¿ç¨è¿äºå­æ®µç²¾ç¡®å°æ§å¶å°±ç»ªæ£æµçè¡ä¸ºï¼

- `initialDelaySeconds`ï¼å®¹å¨å¯å¨åè¦ç­å¾å¤å°ç§åæå¯å¨å­æ´»åå°±ç»ªæ¢æµå¨ï¼ é»è®¤æ¯ 0 ç§ï¼æå°å¼æ¯ 0ã
- `periodSeconds`ï¼æ§è¡æ¢æµçæ¶é´é´éï¼åä½æ¯ç§ï¼ãé»è®¤æ¯ 10 ç§ãæå°å¼æ¯ 1ã
- `timeoutSeconds`ï¼æ¢æµçè¶æ¶åç­å¾å¤å°ç§ãé»è®¤å¼æ¯ 1 ç§ãæå°å¼æ¯ 1ã
- `successThreshold`ï¼æ¢æµå¨å¨å¤±è´¥åï¼è¢«è§ä¸ºæåçæå°è¿ç»­æåæ°ãé»è®¤å¼æ¯ 1ã å­æ´»åå¯å¨æ¢æµçè¿ä¸ªå¼å¿é¡»æ¯ 1ãæå°å¼æ¯ 1ã
- `failureThreshold`ï¼å½æ¢æµå¤±è´¥æ¶ï¼Kubernetes çéè¯æ¬¡æ°ã å¯¹å­æ´»æ¢æµèè¨ï¼æ¾å¼å°±æå³çéæ°å¯å¨å®¹å¨ã å¯¹å°±ç»ªæ¢æµèè¨ï¼æ¾å¼æå³ç Pod ä¼è¢«æä¸æªå°±ç»ªçæ ç­¾ãé»è®¤å¼æ¯ 3ãæå°å¼æ¯ 1ã

``` yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  strategy:
     rollingUpdate:
      maxSurge: 1
      maxUnavailable: 1
  replicas: 3
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: guangzhengli/hellok8s:bad
          name: hellok8s-container
          readinessProbe:
            httpGet:
              path: /healthz
              port: 3000
            initialDelaySeconds: 1
            successThreshold: 5
```

éè¿ `get` å½ä»¤å¯ä»¥åç°ä¸¤ä¸ª pod ä¸ç´å¤äºè¿æ²¡æ Ready çç¶æå½ä¸­ï¼éè¿ `describe` å½ä»¤å¯ä»¥çå°æ¯å ä¸º `Readiness probe failed: HTTP probe failed with statuscode: 500` çåå ãåå ä¸ºè®¾ç½®äºæå°ä¸å¯ç¨çæå¡æ°éä¸º`maxUnavailable=1`ï¼è¿æ ·è½ä¿è¯å©ä¸ä¸¤ä¸ª `v2` çæ¬ç `hellok8s` è½ç»§ç»­æä¾æå¡ï¼

```shell
kubectl apply -f deployment.yaml

kubectl get pods                
# NAME                                   READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-66799848c4-8xzsz   1/1     Running   0          102s
# hellok8s-deployment-66799848c4-m9dl5   1/1     Running   0          102s
# hellok8s-deployment-9c57c7f56-rww7k    0/1     Running   0          26s
# hellok8s-deployment-9c57c7f56-xt9tw    0/1     Running   0          26s


kubectl describe pod hellok8s-deployment-9c57c7f56-rww7k
# Events:
#   Type     Reason     Age                From               Message
#   ----     ------     ----               ----               -------
#   Normal   Scheduled  74s                default-scheduler  Successfully assigned default/hellok8s-deployment-9c57c7f56-rww7k to minikube
#   Normal   Pulled     73s                kubelet            Container image "guangzhengli/hellok8s:bad" already present on machine
#   Normal   Created    73s                kubelet            Created container hellok8s-container
#   Normal   Started    73s                kubelet            Started container hellok8s-container
#   Warning  Unhealthy  0s (x10 over 72s)  kubelet            Readiness probe failed: HTTP probe failed with statuscode: 500
```

## Service

ç»è¿åé¢å èçç»ä¹ ï¼å¯è½ä½ ä¼æä¸äºçæï¼

* ä¸ºä»ä¹ pod ä¸å°±ç»ª (Ready) çè¯ï¼`kubernetes` ä¸ä¼å°æµééå®åå°è¯¥ podï¼è¿æ¯æä¹åå°çï¼
* åé¢è®¿é®æå¡çæ¹å¼æ¯éè¿ `port-forword` å° pod çç«¯å£æ´é²å°æ¬å°ï¼ä¸ä»éè¦åå¯¹ pod çåå­ï¼ä¸æ¦ deployment éæ°åå»ºæ°ç podï¼pod åå­å IP å°åä¹ä¼éä¹ååï¼å¦ä½ä¿è¯ç¨³å®çè®¿é®å°åå¢ï¼ã
* å¦æä½¿ç¨ deployment é¨ç½²äºå¤ä¸ª Pod å¯æ¬ï¼å¦ä½åè´è½½åè¡¡å¢ï¼

`kubernetes` æä¾äºä¸ç§åå« `Service` çèµæºå¸®å©è§£å³è¿äºé®é¢ï¼å®ä¸º pod æä¾ä¸ä¸ªç¨³å®ç EndpointãServie ä½äº pod çåé¢ï¼è´è´£æ¥æ¶è¯·æ±å¹¶å°å®ä»¬ä¼ éç»å®åé¢çææpodãä¸æ¦æå¡ä¸­ç Pod éååçæ´æ¹ï¼Endpoints å°±ä¼è¢«æ´æ°ï¼è¯·æ±çéå®åèªç¶ä¹ä¼å¯¼åææ°ç podã

### ClusterIP

æä»¬åæ¥çç `Service` é»è®¤ä½¿ç¨ç `ClusterIP` ç±»åï¼é¦ååä¸äºåå¤å·¥ä½ï¼å¨ä¹åç `hellok8s:v2` çæ¬ä¸å ä¸è¿åå½åæå¡æå¨ç `hostname` åè½ï¼åçº§å° `v3` çæ¬ã

``` go
package main

import (
	"fmt"
	"io"
	"net/http"
	"os"
)

func hello(w http.ResponseWriter, r *http.Request) {
	host, _ := os.Hostname()
	io.WriteString(w, fmt.Sprintf("[v3] Hello, Kubernetes!, From host: %s", host))
}

func main() {
	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

`Dockerfile` åä¹åä¿æä¸è´ï¼æå `tag=v3` å¹¶æ¨éå°è¿ç¨ä»åºã

``` shell
docker build . -t guangzhengli/hellok8s:v3

docker push guangzhengli/hellok8s:v3
```

ä¿®æ¹ deployment ç `hellok8s` ä¸º `v3` çæ¬ãæ§è¡ `kubectl apply -f deployment.yaml` æ´æ° deploymentã

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  replicas: 3
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: guangzhengli/hellok8s:v3
          name: hellok8s-container
```

æ¥ä¸æ¥æ¯ `Service` èµæºçå®ä¹ï¼æä»¬ä½¿ç¨ `ClusterIP` çæ¹å¼å®ä¹ Serviceï¼éè¿ `kubernetes` éç¾¤çåé¨ IP æ´é²æå¡ï¼å½æä»¬åªéè¦è®©éç¾¤ä¸­è¿è¡çå¶ä»åºç¨ç¨åºè®¿é®æä»¬ç pod æ¶ï¼å°±å¯ä»¥ä½¿ç¨è¿ç§ç±»åçServiceãé¦ååå»ºä¸ä¸ª service-hellok8s-clusterip.yaml` æä»¶ã

``` yaml
apiVersion: v1
kind: Service
metadata:
  name: service-hellok8s-clusterip
spec:
  type: ClusterIP
  selector:
    app: hellok8s
  ports:
  - port: 3000
    targetPort: 3000
```

é¦åéè¿ `kubectl get endpoints` æ¥çç Endpointãè¢« selector éä¸­ç Podï¼å°±ç§°ä¸º Service ç Endpointsãå®ç»´æ¤ç Pod ç IP å°åï¼åªè¦æå¡ä¸­ç Pod éååçæ´æ¹ï¼Endpoints å°±ä¼è¢«æ´æ°ãéè¿ `kubectl get pod -o wide` å½ä»¤è·å Pod æ´å¤çä¿¡æ¯ï¼å¯ä»¥çå° 3 ä¸ª Pod ç IP å°åå Endpoints ä¸­æ¯ä¿æä¸è´çï¼ä½ å¯ä»¥è¯è¯å¢å¤§æåå° Deployment ä¸­ Pod ç replicasï¼è§å¯ Endpoints ä¼ä¸ä¼åçååã

```shell
kubectl apply -f service-hellok8s-clusterip.yaml

kubectl get endpoints
# NAME                         ENDPOINTS                                          AGE
# service-hellok8s-clusterip   172.17.0.10:3000,172.17.0.2:3000,172.17.0.3:3000   10s

kubectl get pod -o wide
# NAME                                   READY   STATUS    RESTARTS   AGE    IP           NODE 
# hellok8s-deployment-5d5545b69c-24lw5   1/1     Running   0          112s   172.17.0.7   minikube 
# hellok8s-deployment-5d5545b69c-9g94t   1/1     Running   0          112s   172.17.0.3   minikube
# hellok8s-deployment-5d5545b69c-9gm8r   1/1     Running   0          112s   172.17.0.2   minikube
# nginx                                  1/1     Running   0          112s   172.17.0.9   minikube

kubectl get service
# NAME                         TYPE        CLUSTER-IP      EXTERNAL-IP   PORT(S)    AGE
# service-hellok8s-clusterip   ClusterIP   10.104.96.153   <none>        3000/TCP   10s
```

æ¥çæä»¬å¯ä»¥éè¿å¨éç¾¤å¶å®åºç¨ä¸­è®¿é® `service-hellok8s-clusterip` ç IP å°å `10.104.96.153` æ¥è®¿é® `hellok8s:v3` æå¡ã

è¿ééè¿å¨éç¾¤ååå»ºä¸ä¸ª `nginx` æ¥è®¿é® `hellok8s` æå¡ãåå»ºåè¿å¥ `nginx` å®¹å¨æ¥ç¨ `curl` å½ä»¤è®¿é® `service-hellok8s-clusterip` ã

```yaml
apiVersion: v1
kind: Pod
metadata:
  name: nginx
  labels:
    app: nginx
spec:
  containers:
    - name: nginx-container
      image: nginx
```

```shell
kubectl get pods
# NAME                                   READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-5d5545b69c-24lw5   1/1     Running   0          27m
# hellok8s-deployment-5d5545b69c-9g94t   1/1     Running   0          27m
# hellok8s-deployment-5d5545b69c-9gm8r   1/1     Running   0          27m
# nginx                                  1/1     Running   0          41m

kubectl get service
# NAME                         TYPE        CLUSTER-IP      EXTERNAL-IP   PORT(S)    AGE
# service-hellok8s-clusterip   ClusterIP   10.104.96.153   <none>        3000/TCP   10s

kubectl exec -it nginx-pod /bin/bash
# root@nginx-pod:/# curl 10.104.96.153:3000
# [v3] Hello, Kubernetes!, From host: hellok8s-deployment-5d5545b69c-9gm8r
# root@nginx-pod:/# curl 10.104.96.153:3000
#[v3] Hello, Kubernetes!, From host: hellok8s-deployment-5d5545b69c-9g94t
```

å¯ä»¥çå°ï¼æä»¬å¤æ¬¡ `curl 10.104.96.153:3000` è®¿é® `hellok8s` Service IP å°åï¼è¿åç `hellok8s:v3` `hostname` ä¸ä¸æ ·ï¼è¯´æ Service å¯ä»¥æ¥æ¶è¯·æ±å¹¶å°å®ä»¬ä¼ éç»å®åé¢çææ podï¼è¿å¯ä»¥èªå¨è´è½½åè¡¡ãä½ ä¹å¯ä»¥è¯è¯å¢å æèåå° `hellok8s:v3` pod å¯æ¬æ°éï¼è§å¯ Service çè¯·æ±æ¯å¦ä¼å¨æåæ´ãè°ç¨è¿ç¨å¦ä¸å¾æç¤ºï¼

![service-clusterip-fix-name](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/service-clusterip-fix-name.png)

é¤äºä¸è¿°ç `ClusterIp` çæ¹å¼å¤ï¼Kubernetes `ServiceTypes` åè®¸æå®ä½ æéè¦ç Service ç±»åï¼é»è®¤æ¯ `ClusterIP`ã`Type` çå¼åæ¬å¦ä¸ï¼

- `ClusterIP`ï¼éè¿éç¾¤çåé¨ IP æ´é²æå¡ï¼éæ©è¯¥å¼æ¶æå¡åªè½å¤å¨éç¾¤åé¨è®¿é®ã è¿ä¹æ¯é»è®¤ç `ServiceType`ã
- [`NodePort`](https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport)ï¼éè¿æ¯ä¸ªèç¹ä¸ç IP åéæç«¯å£ï¼`NodePort`ï¼æ´é²æå¡ã `NodePort` æå¡ä¼è·¯ç±å°èªå¨åå»ºç `ClusterIP` æå¡ã éè¿è¯·æ± `<èç¹ IP>:<èç¹ç«¯å£>`ï¼ä½ å¯ä»¥ä»éç¾¤çå¤é¨è®¿é®ä¸ä¸ª `NodePort` æå¡ã
- [`LoadBalancer`](https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer)ï¼ä½¿ç¨äºæä¾åçè´è½½åè¡¡å¨åå¤é¨æ´é²æå¡ã å¤é¨è´è½½åè¡¡å¨å¯ä»¥å°æµéè·¯ç±å°èªå¨åå»ºç `NodePort` æå¡å `ClusterIP` æå¡ä¸ã
- [`ExternalName`](https://kubernetes.io/docs/concepts/services-networking/service/#externalname)ï¼éè¿è¿å `CNAME` åå¯¹åºå¼ï¼å¯ä»¥å°æå¡æ å°å° `externalName` å­æ®µçåå®¹ï¼ä¾å¦ï¼`foo.bar.example.com`ï¼ã æ éåå»ºä»»ä½ç±»åä»£çã

### NodePort

æä»¬ç¥é`kubernetes` éç¾¤å¹¶ä¸æ¯åæºè¿è¡ï¼å®ç®¡ççå¤å°èç¹å³ [Node](https://kubernetes.io/docs/concepts/architecture/nodes/)ï¼å¯ä»¥éè¿æ¯ä¸ªèç¹ä¸ç IP åéæç«¯å£ï¼`NodePort`ï¼æ´é²æå¡ãå¦ä¸å¾æç¤ºï¼å¦æéç¾¤åæä¸¤å° Node è¿è¡ç `hellok8s:v3`ï¼æä»¬åå»ºä¸ä¸ª `NodePort` ç±»åç Serviceï¼å° `hellok8s:v3` ç `3000` ç«¯å£æ å°å° Node æºå¨ç `30000` ç«¯å£ (å¨ 30000-32767 èå´å)ï¼å°±å¯ä»¥éè¿è®¿é® `http://node1-ip:30000` æè `http://node2-ip:30000` è®¿é®å°æå¡ã

![service-nodeport-fix-name](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/service-nodeport-fix-name.png)

è¿éä»¥ `minikube` ä¸ºä¾ï¼æä»¬å¯ä»¥éè¿ `minikube ip` å½ä»¤æ¿å° k8s cluster node  IPå°åãä¸é¢çæç¨é½ä»¥ææ¬æºç `192.168.59.100` ä¸ºä¾ï¼éè¦æ¿æ¢æä½ ç IP å°åã

```shell
minikube ip
# 192.168.59.100
```

æ¥çä»¥ NodePort ç ServiceType åå»ºä¸ä¸ª Service æ¥æ¥ç®¡ pod æµéãéè¿`minikube` èç¹ä¸ç IP `192.168.59.100` æ´é²æå¡ã `NodePort` æå¡ä¼è·¯ç±å°èªå¨åå»ºç `ClusterIP` æå¡ã éè¿è¯·æ± `<èç¹ IP>:<èç¹ç«¯å£>` -- `192.168.59.100`:30000ï¼ä½ å¯ä»¥ä»éç¾¤çå¤é¨è®¿é®ä¸ä¸ª `NodePort` æå¡ï¼æç»éå®åå° `hellok8s:v3` ç `3000` ç«¯å£ã

```yaml
apiVersion: v1
kind: Service
metadata:
  name: service-hellok8s-nodeport
spec:
  type: NodePort
  selector:
    app: hellok8s
  ports:
  - port: 3000
    nodePort: 30000
```

åå»º `service-hellok8s-nodeport` Service åï¼ä½¿ç¨ `curl` å½ä»¤æèæµè§å¨è®¿é® `http://192.168.59.100:30000` å¯ä»¥å¾å°ç»æã

```shell
kubectlÂ applyÂ -fÂ service-hellok8s-nodeport.yaml

kubectl get service
# NAME                         TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)          AGE
# service-hellok8s-nodeport    NodePort    10.109.188.161   <none>        3000:30000/TCP   28s

kubectl get pods
# NAME                                   READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-5d5545b69c-24lw5   1/1     Running   0          27m
# hellok8s-deployment-5d5545b69c-9g94t   1/1     Running   0          27m
# hellok8s-deployment-5d5545b69c-9gm8r   1/1     Running   0          27m

curl http://192.168.59.100:30000
# [v3] Hello, Kubernetes!, From host: hellok8s-deployment-5d5545b69c-9g94t

curl http://192.168.59.100:30000
# [v3] Hello, Kubernetes!, From host: hellok8s-deployment-5d5545b69c-24lw5
```

### LoadBalancer

[`LoadBalancer`](https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer) æ¯ä½¿ç¨äºæä¾åçè´è½½åè¡¡å¨åå¤é¨æ´é²æå¡ã å¤é¨è´è½½åè¡¡å¨å¯ä»¥å°æµéè·¯ç±å°èªå¨åå»ºç `NodePort` æå¡å `ClusterIP` æå¡ä¸ï¼åå¦ä½ å¨ [AWS](https://aws.amazon.com) ç [EKS](https://aws.amazon.com/eks/) éç¾¤ä¸åå»ºä¸ä¸ª Type ä¸º `LoadBalancer`  ç Serviceãå®ä¼èªå¨åå»ºä¸ä¸ª ELB ([Elastic Load Balancer](https://aws.amazon.com/elasticloadbalancing)) ï¼å¹¶å¯ä»¥æ ¹æ®éç½®ç IP æ± ä¸­èªå¨åéä¸ä¸ªç¬ç«ç IP å°åï¼å¯ä»¥ä¾å¤é¨è®¿é®ã

è¿éå ä¸ºæä»¬ä½¿ç¨çæ¯ `minikube`ï¼å¯ä»¥ä½¿ç¨ `minikube tunnel` æ¥è¾å©åå»º LoadBalancer ç `EXTERNAL_IP`ï¼å·ä½æç¨å¯ä»¥æ¥ç[å®ç½ææ¡£](https://minikube.sigs.k8s.io/docs/handbook/accessing/#loadbalancer-access)ï¼ä½æ¯åå®éäºæä¾åç LoadBalancer è¿æ¯ææ¬è´¨åºå«ï¼æä»¥ [Repository](https://github.com/guangzhengli/kubernetes_workshop) ä¸åæ´å¤éè¿°ï¼ææ¡ä»¶çå¯ä»¥ä½¿ç¨ [AWS](https://aws.amazon.com) ç [EKS](https://aws.amazon.com/eks/) éç¾¤ä¸åå»ºä¸ä¸ª ELB ([Elastic Load Balancer](https://aws.amazon.com/elasticloadbalancing)) è¯è¯ã

ä¸å¾æ¾ç¤º LoadBalancer ç Service æ¶æå¾ã

![service-loadbalancer-fix-name](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/service-loadbalancer-fix-name.png)

## ingress

[Ingress](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.25/#ingress-v1beta1-networking-k8s-io) å¬å¼ä»éç¾¤å¤é¨å°éç¾¤å[æå¡](https://kubernetes.io/docs/concepts/services-networking/service/)ç HTTP å HTTPS è·¯ç±ã æµéè·¯ç±ç± Ingress èµæºä¸å®ä¹çè§åæ§å¶ãIngress å¯ä¸º Service æä¾å¤é¨å¯è®¿é®ç URLãè´è½½åè¡¡æµéã SSL/TLSï¼ä»¥ååºäºåç§°çèææç®¡ãä½ å¿é¡»æ¥æä¸ä¸ª [Ingress æ§å¶å¨](https://kubernetes.io/zh-cn/docs/concepts/services-networking/ingress-controllers) æè½æ»¡è¶³ Ingress çè¦æ±ã ä»åå»º Ingress èµæºæ¬èº«æ²¡æä»»ä½ææã [Ingress æ§å¶å¨](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers) éå¸¸è´è´£éè¿è´è½½åè¡¡å¨æ¥å®ç° Ingressï¼ä¾å¦ `minikube` é»è®¤ä½¿ç¨çæ¯ [nginx-ingress](https://minikube.sigs.k8s.io/docs/tutorials/nginx_tcp_udp_ingress/)ï¼ç®å  `minikube` ä¹æ¯æ [Kong-Ingress](https://minikube.sigs.k8s.io/docs/handbook/addons/kong-ingress/)ã

Ingress å¯ä»¥âç®åçè§£âä¸ºæå¡çç½å³ Gatewayï¼å®æ¯æææµéçå¥å£ï¼ç»è¿éç½®çè·¯ç±è§åï¼å°æµééå®åå°åç«¯çæå¡ã

å¨   `minikube` ä¸­ï¼å¯ä»¥éè¿ä¸é¢å½ä»¤å¼å¯ Ingress-Controller çåè½ãé»è®¤ä½¿ç¨çæ¯ [nginx-ingress](https://minikube.sigs.k8s.io/docs/tutorials/nginx_tcp_udp_ingress/)ã

```shell
minikube addons enable ingress
```

æ¥çå é¤ä¹ååå»ºçææ `pod`, `deployment`, `service` èµæºã

``` shell
kubectl delete deployment,service --all
```

æ¥çæ ¹æ®ä¹åçæç¨ï¼åå»º `hellok8s:v3` å `nginx` ç`deployment`ä¸ `service` èµæºãService ç type ä¸º ClusterIP å³å¯ã

`hellok8s:v3` çç«¯å£æ å°ä¸º `3000:3000`ï¼`nginx` çç«¯å£æ å°ä¸º `4000:80`ï¼è¿éåç»­å Ingress Route è§åæ¶ä¼ç¨å°ã

```yaml
apiVersion: v1
kind: Service
metadata:
  name: service-hellok8s-clusterip
spec:
  type: ClusterIP
  selector:
    app: hellok8s
  ports:
  - port: 3000
    targetPort: 3000

---

apiVersion: apps/v1
kind: Deployment
metadata:
  name: hellok8s-deployment
spec:
  replicas: 3
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: guangzhengli/hellok8s:v3
          name: hellok8s-container
```

```yaml
apiVersion: v1
kind: Service
metadata:
  name: service-nginx-clusterip
spec:
  type: ClusterIP
  selector:
    app: nginx
  ports:
  - port: 4000
    targetPort: 80

---

apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-deployment
spec:
  replicas: 2
  selector:
    matchLabels:
      app: nginx
  template:
    metadata:
      labels:
        app: nginx
    spec:
      containers:
      - image: nginx
        name: nginx-container
```

```shell
kubectl apply -f hellok8s.yaml                 
# service/service-hellok8s-clusterip created
# deployment.apps/hellok8s-deployment created

kubectl apply -f nginx.yaml   
# service/service-nginx-clusterip created
# deployment.apps/nginx-deployment created

kubectl get pods            
# NAME                                   READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-5d5545b69c-4wvmf   1/1     Running   0          55s
# hellok8s-deployment-5d5545b69c-qcszp   1/1     Running   0          55s
# hellok8s-deployment-5d5545b69c-sn7mn   1/1     Running   0          55s
# nginx-deployment-d47fd7f66-d9r7x       1/1     Running   0          34s
# nginx-deployment-d47fd7f66-hp5nf       1/1     Running   0          34s

kubectl get service
# NAME                         TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)    AGE
# service-hellok8s-clusterip   ClusterIP   10.97.88.18      <none>        3000/TCP   77s
# service-nginx-clusterip      ClusterIP   10.103.161.247   <none>        4000/TCP   56s
```

è¿æ ·å¨ k8s éç¾¤ä¸­ï¼å°±æ 3 ä¸ª `hellok8s:v3` ç podï¼2 ä¸ª `nginx` ç podãå¹¶ä¸`hellok8s:v3` çç«¯å£æ å°ä¸º `3000:3000`ï¼`nginx` çç«¯å£æ å°ä¸º `4000:80`ãå¨è¿ä¸ªåºç¡ä¸ï¼æ¥ä¸æ¥ç¼å Ingress èµæºçå®ä¹ï¼`nginx.ingress.kubernetes.io/ssl-redirect: "false"` çæææ¯è¿éå³é­ `https` è¿æ¥ï¼åªä½¿ç¨ `http` è¿æ¥ã

å¹éåç¼ä¸º `/hello` çè·¯ç±è§åï¼éå®åå° `hellok8s:v3` æå¡ï¼å¹éåç¼ä¸º `/` çè·è·¯å¾éå®åå° `nginx`ã

```yaml
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata:
  name: hello-ingress
  annotations:
    # We are defining this annotation to prevent nginx
    # from redirecting requests to `https` for now
    nginx.ingress.kubernetes.io/ssl-redirect: "false"
spec:
  rules:
    - http:
        paths:
          - path: /hello
            pathType: Prefix
            backend:
              service:
                name: service-hellok8s-clusterip
                port:
                  number: 3000
          - path: /
            pathType: Prefix
            backend:
              service:
                name: service-nginx-clusterip
                port:
                  number: 4000

```

```shell
kubectl apply -f ingress.yaml
# ingress.extensions/hello-ingress created

kubectl get ingress          
# NAME            CLASS   HOSTS   ADDRESS   PORTS   AGE
# hello-ingress   nginx   *                 80      16s

# replace 192.168.59.100 by your minikube ip
curl http://192.168.59.100/hello
# [v3] Hello, Kubernetes!, From host: hellok8s-deployment-5d5545b69c-sn7mn

curl http://192.168.59.100/
# (....Thank you for using nginx.....)
```

ä¸é¢çæç¨ä¸­å°æææµéé½åéå° Ingress ä¸­ï¼å¦ä¸å¾æç¤ºï¼

![ingress](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/ingress.png)

## Namespace

å¨å®éçå¼åå½ä¸­ï¼ææ¶åæä»¬éè¦ä¸åçç¯å¢æ¥åå¼ååæµè¯ï¼ä¾å¦ `dev` ç¯å¢ç»å¼åä½¿ç¨ï¼`test` ç¯å¢ç» QA ä½¿ç¨ï¼é£ä¹ k8s è½ä¸è½å¨ä¸åç¯å¢ `dev` `test` `uat` `prod` ä¸­åºåèµæºï¼è®©ä¸åç¯å¢çèµæºç¬ç«äºç¸ä¸å½±åå¢ï¼ç­æ¡æ¯è¯å®çï¼k8s æä¾äºåä¸º Namespace çèµæºæ¥å¸®å©éç¦»èµæºã

å¨ Kubernetes ä¸­ï¼**åå­ç©ºé´ï¼Namespaceï¼** æä¾ä¸ç§æºå¶ï¼å°åä¸éç¾¤ä¸­çèµæºååä¸ºç¸äºéç¦»çç»ã åä¸åå­ç©ºé´åçèµæºåç§°è¦å¯ä¸ï¼ä½è·¨åå­ç©ºé´æ¶æ²¡æè¿ä¸ªè¦æ±ã åå­ç©ºé´ä½ç¨åä»éå¯¹å¸¦æåå­ç©ºé´çå¯¹è±¡ï¼ä¾å¦ DeploymentãService ç­ã

åé¢çæç¨ä¸­ï¼é»è®¤ä½¿ç¨ç namespace æ¯ `default`ã

ä¸é¢å±ç¤ºå¦ä½åå»ºä¸ä¸ªæ°ç namespaceï¼ `namespace.yaml` æä»¶å®ä¹äºä¸¤ä¸ªä¸åç namespaceï¼åå«æ¯ `dev` å `test`ã

``` yaml
apiVersion: v1
kind: Namespace
metadata:
  name: dev
  
---

apiVersion: v1
kind: Namespace
metadata:
  name: test
```

å¯ä»¥éè¿`kubectl apply -f namespaces.yaml` åå»ºä¸¤ä¸ªæ°ç namespaceï¼åå«æ¯ `dev` å `test`ã

```yaml
kubectl apply -f namespaces.yaml    
# namespace/dev created
# namespace/test created


kubectl get namespaces          
# NAME              STATUS   AGE
# default           Active   215d
# dev               Active   2m44s
# ingress-nginx     Active   110d
# kube-node-lease   Active   215d
# kube-public       Active   215d
# kube-system       Active   215d
# test              Active   2m44s
```

é£ä¹å¦ä½å¨æ°ç namespace ä¸åå»ºèµæºåè·åèµæºå¢ï¼åªéè¦å¨å½ä»¤åé¢å ä¸ `-n namespace` å³å¯ãä¾å¦æ ¹æ®ä¸é¢æç¨ä¸­ï¼å¨åä¸º `dev` ç namespace ä¸åå»º `hellok8s:v3` ç deployment èµæºã

```shell
kubectl apply -f deployment.yaml -n dev

kubectl get pods -n dev
```

## Configmap

ä¸é¢çæç¨æå°ï¼æä»¬å¨ä¸åç¯å¢ `dev` `test` `uat` `prod` ä¸­åºåèµæºï¼å¯ä»¥è®©å¶èµæºç¬ç«äºç¸ä¸åå½±åï¼ä½æ¯éä¹èæ¥ä¹ä¼å¸¦æ¥ä¸äºé®é¢ï¼ä¾å¦ä¸åç¯å¢çæ°æ®åºçå°åå¾å¾æ¯ä¸ä¸æ ·çï¼é£ä¹å¦æå¨ä»£ç ä¸­ååä¸ä¸ªæ°æ®åºçå°åï¼å°±ä¼åºç°é®é¢ã

K8S ä½¿ç¨ ConfigMap æ¥å°ä½ çéç½®æ°æ®ååºç¨ç¨åºä»£ç åå¼ï¼å°éæºå¯æ§çæ°æ®ä¿å­å°é®å¼å¯¹ä¸­ãConfigMap å¨è®¾è®¡ä¸ä¸æ¯ç¨æ¥ä¿å­å¤§éæ°æ®çãå¨ ConfigMap ä¸­ä¿å­çæ°æ®ä¸å¯è¶è¿ 1 MiBãå¦æä½ éè¦ä¿å­è¶åºæ­¤å°ºå¯¸éå¶çæ°æ®ï¼ä½ å¯è½èèæè½½å­å¨å·ã

ä¸é¢æä»¬å¯ä»¥æ¥çä¸ä¸ªä¾å­ï¼æä»¬ä¿®æ¹ä¹åä»£ç ï¼åè®¾ä¸åç¯å¢çæ°æ®åºå°åä¸åï¼ä¸é¢ä»£ç ä»ç¯å¢åéä¸­è·å `DB_URL`ï¼å¹¶å°å®è¿åã

```go
package main

import (
	"fmt"
	"io"
	"net/http"
	"os"
)

func hello(w http.ResponseWriter, r *http.Request) {
	host, _ := os.Hostname()
	dbURL := os.Getenv("DB_URL")
	io.WriteString(w, fmt.Sprintf("[v4] Hello, Kubernetes! From host: %s, Get Database Connect URL: %s", host, dbURL))
}

func main() {
	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

æå»º `hellok8s:v4` çéåï¼æ¨éå°è¿ç¨ä»åºãå¹¶å é¤ä¹ååå»ºçææèµæºã

```shell
docker build . -t guangzhengli/hellok8s:v4
docker push guangzhengli/hellok8s:v4

kubectl delete deployment,service,ingress --all
```

æ¥ä¸æ¥åå»ºä¸å namespace ç configmap æ¥å­æ¾ `DB_URL`ã

åå»º `hellok8s-config-dev.yaml` æä»¶

```yaml
apiVersion: v1
kind: ConfigMap
metadata:
  name: hellok8s-config
data:
  DB_URL: "http://DB_ADDRESS_DEV"
```

åå»º `hellok8s-config-test.yaml` æä»¶

```yaml
apiVersion: v1
kind: ConfigMap
metadata:
  name: hellok8s-config
data:
  DB_URL: "http://DB_ADDRESS_TEST"
```

åå«å¨ `dev` `test` ä¸¤ä¸ª namespace ä¸åå»ºç¸åç `ConfigMap`ï¼åå­é½å« hellok8s-configï¼ä½æ¯å­æ¾ç Pair å¯¹ä¸­ Value å¼ä¸ä¸æ ·ã

```shell
kubectl apply -f hellok8s-config-dev.yaml -n dev
# configmap/hellok8s-config created

kubectl apply -f hellok8s-config-test.yaml -n test 
# configmap/hellok8s-config created

kubectl get configmap --all-namespaces
NAMESPACE         NAME                                 DATA   AGE
dev               hellok8s-config                      1      3m12s
test              hellok8s-config                      1      2m1s
```

æ¥çä½¿ç¨ POD çæ¹å¼æ¥é¨ç½² `hellok8s:v4`ï¼å¶ä¸­ `env.name` è¡¨ç¤ºçæ¯å° configmap ä¸­çå¼åè¿ç¯å¢åéï¼è¿æ ·ä»£ç ä»ç¯å¢åéä¸­è·å `DB_URL`ï¼è¿ä¸ª KEY åç§°å¿é¡»ä¿æä¸è´ã`valueFrom` ä»£è¡¨ä»åªéè¯»åï¼`configMapKeyRef` è¿éè¡¨ç¤ºä»åä¸º `hellok8s-config` ç `configMap` ä¸­è¯»å `KEY=DB_URL` ç Valueã

```yaml
apiVersion: v1
kind: Pod
metadata:
  name: hellok8s-pod
spec:
  containers:
    - name: hellok8s-container
      image: guangzhengli/hellok8s:v4
      env:
        - name: DB_URL
          valueFrom:
            configMapKeyRef:
              name: hellok8s-config
              key: DB_URL
```

ä¸é¢åå«å¨ `dev` `test` ä¸¤ä¸ª namespace ä¸åå»º  `hellok8s:v4`ï¼æ¥çéè¿ `port-forward` çæ¹å¼è®¿é®ä¸å namespace çæå¡ï¼å¯ä»¥çå°è¿åç `Get Database Connect URL: http://DB_ADDRESS_TEST` æ¯ä¸ä¸æ ·çï¼

```shell
kubectl apply -f hellok8s.yaml -n dev             
# pod/hellok8s-pod created

kubectl apply -f hellok8s.yaml -n test
# pod/hellok8s-pod created

kubectl port-forward hellok8s-pod 3000:3000 -n dev

curl http://localhost:3000
# [v4] Hello, Kubernetes! From host: hellok8s-pod, Get Database Connect URL: http://DB_ADDRESS_DEV

kubectl port-forward hellok8s-pod 3000:3000 -n test

curl http://localhost:3000
# [v4] Hello, Kubernetes! From host: hellok8s-pod, Get Database Connect URL: http://DB_ADDRESS_TEST
```

## Secret

ä¸é¢æå°ï¼æä»¬ä¼éæ©ä»¥ configmap çæ¹å¼æè½½éç½®ä¿¡æ¯ï¼ä½æ¯å½æä»¬çéç½®ä¿¡æ¯éè¦å å¯çæ¶åï¼ configmap å°±æ æ³æ»¡è¶³è¿ä¸ªè¦æ±ãä¾å¦ä¸é¢è¦æè½½æ°æ®åºå¯ç çæ¶åï¼å°±éè¦æææè½½ã

è¿ä¸ªæ¶åå°±éè¦ Secret æ¥å­å¨å å¯ä¿¡æ¯ï¼è½ç¶å¨èµæºæä»¶çç¼ç ä¸ï¼åªæ¯éè¿ Base64 çæ¹å¼ç®åç¼ç ï¼ä½æ¯å¨å®éçäº§è¿ç¨ä¸­ï¼å¯ä»¥éè¿ pipeline æèä¸ä¸ç [AWS KMS](https://aws.amazon.com/kms/) æå¡è¿è¡å¯é¥ç®¡çãè¿æ ·å°±å¤§å¤§åå°äºå®å¨äºæã

> Secret æ¯ä¸ç§åå«å°éææä¿¡æ¯ä¾å¦å¯ç ãä»¤çæå¯é¥çå¯¹è±¡ãç±äºåå»º Secret å¯ä»¥ç¬ç«äºä½¿ç¨å®ä»¬ç Podï¼ å æ­¤å¨åå»ºãæ¥çåç¼è¾ Pod çå·¥ä½æµç¨ä¸­æ´é² Secretï¼åå¶æ°æ®ï¼çé£é©è¾å°ã Kubernetes åå¨éç¾¤ä¸­è¿è¡çåºç¨ç¨åºä¹å¯ä»¥å¯¹ Secret éåé¢å¤çé¢é²æªæ½ï¼ ä¾å¦é¿åå°æºå¯æ°æ®åå¥éæå¤±æ§å­å¨ã
>
> é»è®¤æåµä¸ï¼Kubernetes Secret æªå å¯å°å­å¨å¨ API æå¡å¨çåºå±æ°æ®å­å¨ï¼etcdï¼ä¸­ã ä»»ä½æ¥æ API è®¿é®æéçäººé½å¯ä»¥æ£ç´¢æä¿®æ¹ Secretï¼ä»»ä½ææè®¿é® etcd çäººä¹å¯ä»¥ã æ­¤å¤ï¼ä»»ä½ææéå¨å½åç©ºé´ä¸­åå»º Pod çäººé½å¯ä»¥ä½¿ç¨è¯¥è®¿é®æéè¯»åè¯¥å½åç©ºé´ä¸­çä»»ä½ Secretï¼ è¿åæ¬é´æ¥è®¿é®ï¼ä¾å¦åå»º Deployment çè½åã
>
> ä¸ºäºå®å¨å°ä½¿ç¨ Secretï¼è¯·è³å°æ§è¡ä»¥ä¸æ­¥éª¤ï¼
>
> 1. ä¸º Secret [å¯ç¨éæå å¯](https://kubernetes.io/docs/tasks/administer-cluster/encrypt-data/)ï¼
> 2. [å¯ç¨æéç½® RBAC è§å](https://kubernetes.io/docs/reference/access-authn-authz/authorization/)æ¥éå¶è¯»åååå¥ Secret çæ°æ®ï¼åæ¬éè¿é´æ¥æ¹å¼ï¼ãéè¦æ³¨æçæ¯ï¼è¢«åè®¸åå»º Pod çäººä¹éå¼å°è¢«ææè·å Secret åå®¹ã
> 3. å¨éå½çæåµä¸ï¼è¿å¯ä»¥ä½¿ç¨ RBAC ç­æºå¶æ¥éå¶åè®¸åªäºä¸»ä½åå»ºæ° Secret ææ¿æ¢ç°æ Secretã

Secret çèµæºå®ä¹å ConfigMap ç»æåºæ¬ä¸è´ï¼å¯ä¸åºå«å¨äº kind æ¯ `Secret`ï¼è¿æ Value éè¦ Base64 ç¼ç ï¼ä½ å¯ä»¥éè¿ä¸é¢å½ä»¤å¿«é  Base64 ç¼è§£ç ãå½ç¶ Secret ä¹æä¾äºä¸ç§ `stringData`ï¼å¯ä»¥ä¸éè¦ Base64 ç¼ç ã

```shell
echo "db_password" | base64
# ZGJfcGFzc3dvcmQK

echo "ZGJfcGFzc3dvcmQK" | base64 -d
# db_password
```

è¿éå° Base64 ç¼ç è¿åçå¼ï¼å¡«å¥å¯¹åºç key - value ä¸­ã

```yaml
# hellok8s-secret.yaml
apiVersion: v1
kind: Secret
metadata:
  name: hellok8s-secret
data:
  DB_PASSWORD: "ZGJfcGFzc3dvcmQK"
```

```yaml
# hellok8s.yaml
apiVersion: v1
kind: Pod
metadata:
  name: hellok8s-pod
spec:
  containers:
    - name: hellok8s-container
      image: guangzhengli/hellok8s:v5
      env:
        - name: DB_PASSWORD
          valueFrom:
            secretKeyRef:
              name: hellok8s-secret
              key: DB_PASSWORD
```

```go
package main

import (
	"fmt"
	"io"
	"net/http"
	"os"
)

func hello(w http.ResponseWriter, r *http.Request) {
	host, _ := os.Hostname()
	dbPassword := os.Getenv("DB_PASSWORD")
	io.WriteString(w, fmt.Sprintf("[v5] Hello, Kubernetes! From host: %s, Get Database Connect Password: %s", host, dbPassword))
}

func main() {
	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

å¨ä»£ç ä¸­è¯»å `DB_PASSWORD` ç¯å¢åéï¼ç´æ¥è¿åå¯¹åºå­ç¬¦ä¸²ãSecret çä½¿ç¨æ¹æ³ååé¢æç¨ä¸­ ConfigMap åºæ¬ä¸è´ï¼è¿éå°±ä¸åè¿å¤èµè¿°ã

```shell
docker build . -t guangzhengli/hellok8s:v5

docker push guangzhengli/hellok8s:v5

kubectl apply -f hellok8s-secret.yaml

kubectl apply -f hellok8s.yaml

kubectl port-forward hellok8s-pod 3000:3000
```


## Job

å¨å®éçå¼åè¿ç¨ä¸­ï¼è¿æä¸ç±»ä»»å¡æ¯ä¹åçèµæºä¸è½æ»¡è¶³çï¼å³ä¸æ¬¡æ§ä»»å¡ãä¾å¦å¸¸è§çè®¡ç®ä»»å¡ï¼åªéè¦æ¿å°ç¸å³æ°æ®è®¡ç®åå¾åºç»æå³å¯ï¼æ éä¸ç´è¿è¡ãèå¤çè¿ä¸ç±»ä»»å¡çèµæºå°±æ¯ Jobã

> Job ä¼åå»ºä¸ä¸ªæèå¤ä¸ª Podï¼å¹¶å°ç»§ç»­éè¯ Pod çæ§è¡ï¼ç´å°æå®æ°éç Pod æåç»æ­¢ã éç Pod æåç»æï¼Job è·è¸ªè®°å½æåå®æç Pod ä¸ªæ°ã å½æ°éè¾¾å°æå®çæåä¸ªæ°éå¼æ¶ï¼ä»»å¡ï¼å³ Jobï¼ç»æã å é¤ Job çæä½ä¼æ¸é¤æåå»ºçå¨é¨ Podã æèµ· Job çæä½ä¼å é¤ Job çæææ´»è· Podï¼ç´å° Job è¢«åæ¬¡æ¢å¤æ§è¡ã
>
> ä¸ç§ç®åçä½¿ç¨åºæ¯ä¸ï¼ä½ ä¼åå»ºä¸ä¸ª Job å¯¹è±¡ä»¥ä¾¿ä»¥ä¸ç§å¯é çæ¹å¼è¿è¡æ Pod ç´å°å®æã å½ç¬¬ä¸ä¸ª Pod å¤±è´¥æèè¢«å é¤ï¼æ¯å¦å ä¸ºèç¹ç¡¬ä»¶å¤±ææèéå¯ï¼æ¶ï¼Job å¯¹è±¡ä¼å¯å¨ä¸ä¸ªæ°ç Podã

ä¸é¢æ¥çä¸ä¸ª Job çèµæºå®ä¹ï¼å¶ä¸­ Kind å metadata.name æ¯èµæºç±»åååå­å°±ä¸åè§£éï¼`completions` æçæ¯ä¼åå»º Pod çæ°éï¼æ¯ä¸ª pod é½ä¼å®æä¸é¢çä»»å¡ã`parallelism` æçæ¯å¹¶åæ§è¡æå¤§æ°éï¼ä¾å¦ä¸é¢å°±ä¼ååå»º 3 ä¸ª pod å¹¶åæ§è¡ä»»å¡ï¼ä¸æ¦æä¸ª pod æ§è¡å®æï¼å°±ä¼ååå»ºæ°ç pod æ¥æ§è¡ï¼ç´å° 5 ä¸ª pod æ§è¡å®æï¼Job æä¼è¢«æ è®°ä¸ºå®æã

`restartPolicy = "OnFailure` çå«ä¹å Pod çå½å¨æç¸å³ï¼Pod ä¸­çå®¹å¨å¯è½å ä¸ºéåºæ¶è¿åå¼éé¶ï¼ æèå®¹å¨å ä¸ºè¶åºåå­çº¦æèè¢«ææ­»ç­ç­ã å¦æåçè¿ç±»äºä»¶ï¼å¹¶ä¸ `.spec.template.spec.restartPolicy = "OnFailure"`ï¼ Pod åç»§ç»­çå¨å½åèç¹ï¼ä½å®¹å¨ä¼è¢«éæ°è¿è¡ãå æ­¤ï¼ä½ çç¨åºéè¦è½å¤å¤çå¨æ¬å°è¢«éå¯çæåµï¼æèè¦è®¾ç½® `.spec.template.spec.restartPolicy = "Never"`ã 

```yaml
apiVersion: batch/v1
kind: Job
metadata:
  name: hello-job
spec:
  parallelism: 3
  completions: 5
  template:
    spec:
      restartPolicy: OnFailure
      containers:
        - name: echo
          image: busybox
          command: [for i in 9 8 7 6 5 4 3 2 1 ; do echo $i ; done]
```

éè¿ä¸é¢çå½ä»¤åå»º jobï¼å¯ä»¥éè¿ `kubectl get pods -w` æ¥è§å¯ job åå»º pod çè¿ç¨åç»æãæåå¯ä»¥éè¿ `logs` å½ä»¤æ¥çæ¥å¿ã

```shell
kubectl apply -f hello-job.yaml

kubectl get jobs                  
# NAME        COMPLETIONS   DURATION   AGE
# hello-job   5/5           19s        83s

kubectl get pods                      
# NAME                                   READY   STATUS      RESTARTS   AGE
# hello-job--1-5gjjr                     0/1     Completed   0          34s
# hello-job--1-8ffmn                     0/1     Completed   0          26s
# hello-job--1-ltsvm                     0/1     Completed   0          34s
# hello-job--1-mttwv                     0/1     Completed   0          29s
# hello-job--1-ww2qp                     0/1     Completed   0          34s

kubectl logs -f hello-job--1-5gjjr 
# 1
# ...
```

Job å®ææ¶ä¸ä¼ååå»ºæ°ç Podï¼ä¸è¿å·²æç Pod [éå¸¸](https://kubernetes.io/docs/concepts/workloads/controllers/job/#pod-backoff-failure-policy)ä¹ä¸ä¼è¢«å é¤ã ä¿çè¿äº Pod ä½¿å¾ä½ å¯ä»¥æ¥çå·²å®æç Pod çæ¥å¿è¾åºï¼ä»¥ä¾¿æ£æ¥éè¯¯ãè­¦åæèå¶å®è¯æ­æ§è¾åºã å¯ä»¥ä½¿ç¨ `kubectl` æ¥å é¤ Jobï¼ä¾å¦ `kubectl delete -f hello-job.yaml`)ãå½ä½¿ç¨ `kubectl` æ¥å é¤ Job æ¶ï¼è¯¥ Job æåå»ºç Pod ä¹ä¼è¢«å é¤ã

## CronJob

*CronJob* å¯ä»¥çè§£ä¸ºå®æ¶ä»»å¡ï¼åå»ºåºäº Cron æ¶é´è°åº¦ç [Jobs](https://kubernetes.io/docs/concepts/workloads/controllers/job/)ã

> CronJob ç¨äºæ§è¡å¨ææ§çå¨ä½ï¼ä¾å¦å¤ä»½ãæ¥åçæç­ã è¿äºä»»å¡ä¸­çæ¯ä¸ä¸ªé½åºè¯¥éç½®ä¸ºå¨ææ§éå¤çï¼ä¾å¦ï¼æ¯å¤©/æ¯å¨/æ¯æä¸æ¬¡ï¼ï¼ ä½ å¯ä»¥å®ä¹ä»»å¡å¼å§æ§è¡çæ¶é´é´éã

Cron æ¶é´è¡¨è¯­æ³

```
# ââââââââââââââ åé (0 - 59)
# â ââââââââââââââ å°æ¶ (0 - 23)
# â â ââââââââââââââ æçæå¤© (1 - 31)
# â â â ââââââââââââââ æä»½ (1 - 12)
# â â â â ââââââââââââââ å¨çæå¤© (0 - 6)ï¼å¨æ¥å°å¨ä¸ï¼å¨æäºç³»ç»ä¸ï¼7 ä¹æ¯æææ¥ï¼
# â â â â â                          æèæ¯ sunï¼monï¼tueï¼webï¼thuï¼friï¼sat
# â â â â â
# â â â â â
# * * * * *
```

ç¨æ³é¤äºéè¦å ä¸ cron è¡¨è¾¾å¼ä¹å¤ï¼å¶ä½åºæ¬å Job ä¿æä¸è´ã

```yaml
apiVersion: batch/v1
kind: CronJob
metadata:
  name: hello-cronjob
spec:
  schedule: "* * * * *" # Every minute
  jobTemplate:
    spec:
      template:
        spec:
          restartPolicy: OnFailure
          containers:
            - name: echo
              image: busybox
              command: [for i in 9 8 7 6 5 4 3 2 1 ; do echo $i ; done]
```

ä½¿ç¨å½ä»¤å Job ä¹åºæ¬ä¿æä¸è´ï¼è¿éå°±ä¸è¿å¤èµè¿°ã

```shell
kubectl apply -f hello-cronjob.yaml
# cronjob.batch/hello-cronjob created

kubectl get cronjob                
# NAME            SCHEDULE    SUSPEND   ACTIVE   LAST SCHEDULE   AGE
# hello-cronjob   * * * * *   False     0        <none>          8s

kubectl get pods   
# NAME                                   READY   STATUS      RESTARTS   AGE
# hello-cronjob-27694609--1-2nmdx        0/1     Completed   0          15s
```

## Helm

ç»è¿åé¢çæç¨ï¼æ³å¿ä½ å·²ç»å¯¹ kubernetes çä½¿ç¨æäºä¸å®ççè§£ãä½æ¯ä¸ç¥éä½ æ¯å¦æ³è¿è¿æ ·ä¸ä¸ªé®é¢ï¼å°±æ¯æä»¬åé¢æç¨ä¸­æå°çææèµæºï¼åæ¬ç¨ `pod`, `deployment`, `service`, `ingress`, `configmap`,`secret` ææèµæºæ¥é¨ç½²ä¸å¥å®æ´ç `hellok8s` æå¡çè¯ï¼é¾ééè¦ä¸ä¸ªä¸ä¸ªç `kubectl apply -f` æ¥åå»ºåï¼å¦ææ¢ä¸ä¸ª namespaceï¼æèè¯´æ¢ä¸å¥ kubernetes éç¾¤é¨ç½²çè¯ï¼åè¦éå¤æ§çæä½åå»ºçè¿ç¨åï¼

æä»¬å¹³å¸¸ä½¿ç¨æä½ç³»ç»æ¶ï¼éè¦å®è£ä¸ä¸ªåºç¨çè¯ï¼å¯ä»¥ç´æ¥ä½¿ç¨ `apt` æè `brew` æ¥ç´æ¥å®è£ï¼èä¸éè¦å³å¿è¿ä¸ªåºç¨éè¦åªäºä¾èµï¼åªäºéç½®ãå¨ä½¿ç¨ kubernetes å®è£åºç¨æå¡ `hellok8s` æ¶ï¼æä»¬èªç¶ä¹å¸æè½å¤ä¸ä¸ªå½ä»¤å°±å®è£å®æï¼èæä¾è¿ä¸ªè½åçï¼å°±æ¯ CNCF çæ¯ä¸é¡¹ç® [Helm](https://github.com/helm/helm)ã

> Helm å¸®å©æ¨ç®¡ç Kubernetes åºç¨ââ Helm Chartï¼Helm æ¯æ¥æ¾ãåäº«åä½¿ç¨è½¯ä»¶æå»º [Kubernetes](https://kubernetes.io/) çæä¼æ¹å¼ã
>
> å¤ææ§ç®¡ç ââå³ä½¿æ¯æå¤æçåºç¨ï¼Helm Chart ä¾ç¶å¯ä»¥æè¿°ï¼ æä¾ä½¿ç¨åç¹ææçå¯éå¤å®è£åºç¨ç¨åºã
>
> æäºåçº§ ââéæ¶éå°åçº§åèªå®ä¹çé©å­æ¶é¤æ¨åçº§ççè¦ã
>
> ååç®å ââ Helm Chart å¾å®¹æå¨å¬å±æç§æåæå¡å¨ä¸åçï¼åååé¨ç½²ç«ç¹ã
>
> åæ» ââ ä½¿ç¨ `helm rollback` å¯ä»¥è½»æ¾åæ»å°ä¹åçåå¸çæ¬ã

æä»¬éè¿ brew æ¥å®è£ helmãæ´å¤æ¹å¼å¯ä»¥åè[å®æ¹ææ¡£](https://helm.sh/zh/docs/intro/install/)ã

```shell
brew install helm
```

Helm çä½¿ç¨æ¹å¼å¯ä»¥è§£éä¸ºï¼Helm å®è£ *charts* å° Kubernetes éç¾¤ä¸­ï¼æ¯æ¬¡å®è£é½ä¼åå»ºä¸ä¸ªæ°ç *release*ãä½ å¯ä»¥å¨ Helm ç chart *repositories* ä¸­å¯»æ¾æ°ç chartã

### ç¨ helm å®è£ hellok8s
å¼å§æ¬èæç¨åï¼æä»¬åæä¹åæå¨åå»ºç hellok8s ç¸å³çèµæºå é¤(é²æ­¢ä½¿ç¨ helm åå»ºååç k8s èµæºå¤±è´¥)ã

å¨å°è¯èªå·±åå»º hellok8s helm chart ä¹åï¼æä»¬å¯ä»¥åæ¥çæä¸ä¸æä¹ä½¿ç¨ helm chartãå¨è¿éæååå»ºå¥½äºä¸ä¸ª hellok8sï¼åæ¬ä¼åå»º deployment, service, ingress, configmaps, secretï¼ç helm chartãéè¿ GitHub actions çææ¾å¨äº [gh-pages](https://github.com/guangzhengli/k8s-tutorials/tree/gh-pages/) åæ¯ä¸ç `index.yaml` æä»¶ä¸­ã

æ¥çå¯ä»¥ä½¿ç¨ä¸é¢å½ä»¤è¿è¡å¿«éå®è£ï¼å¶ä¸­ `helm repo add` è¡¨ç¤ºå°æåå»ºå¥½ç hellok8s chart æ·»å å°èªå·±æ¬å°çä»åºå½ä¸­ï¼`helm install` è¡¨ç¤ºä»ä»åºä¸­å®è£ hellok8s/hello-helm å° k8s éç¾¤å½ä¸­ã

```shell
helm repo add hellok8s https://guangzhengli.github.io/k8s-tutorials/
# "hellok8s" has been added to your repositories

helm install my-hello-helm hellok8s/hello-helm --version 0.1.0
# NAME: my-hello-helm
# NAMESPACE: default
# STATUS: deployed
# REVISION: 1
```

åå»ºå®æåï¼éè¿ `kubectl get` ç­å½ä»¤å¯ä»¥çå°ææ hellok8s èµæºé½åå»ºæåï¼`helm` ä¸æ¡å½ä»¤å³å¯åå°ä¹åæç¨ä¸­ææèµæºçåå»ºï¼éè¿ `curl` k8s éç¾¤ç ingress å°åï¼ä¹å¯ä»¥çå°è¿åå­ç¬¦ä¸²ï¼

```shell
kubectl get pods
# NAME                                  READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-f88f984c6-k8hpz   1/1     Running   0          15h
# hellok8s-deployment-f88f984c6-nzwg6   1/1     Running   0          15h
# hellok8s-deployment-f88f984c6-s89s7   1/1     Running   0          15h
# nginx-deployment-d47fd7f66-6w76b      1/1     Running   0          15h
# nginx-deployment-d47fd7f66-tsqj5      1/1     Running   0          15h

kubectl get deployments
# NAME                  READY   UP-TO-DATE   AVAILABLE   AGE
# hellok8s-deployment   3/3     3            3           15h
# nginx-deployment      2/2     2            2           15h

kubectl get service
# NAME                         TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)    AGE
# kubernetes                   ClusterIP   10.96.0.1        <none>        443/TCP    13d
# service-hellok8s-clusterip   ClusterIP   10.107.198.175   <none>        3000/TCP   15h
# service-nginx-clusterip      ClusterIP   10.100.144.49    <none>        4000/TCP   15h

kubectl get ingress
# NAME               CLASS   HOSTS   ADDRESS     PORTS   AGE
# hellok8s-ingress   nginx   *       localhost   80      15h

kubectl get configmap
# NAME               DATA   AGE
# hellok8s-config    1      15h

kubectl get secret
# NAME                                  TYPE                                  DATA   AGE
# hellok8s-secret                       Opaque                                1      15h
# sh.helm.release.v1.my-hello-helm.v1   helm.sh/release.v1

curl http://192.168.59.100/hello
# [v6] Hello, Helm! Message from helm values: It works with Helm Values[v2]!, From namespace: default, From host: hellok8s-deployment-598bbd6884-ttk78, Get Database Connect URL: http://DB_ADDRESS_DEFAULT, Database Connect Password: db_password
```

### åå»º helm charts

å¨ä½¿ç¨å·²ç»åå»ºå¥½ç hello-helm charts æ¥åå»ºæ´ä¸ª hellok8s èµæºåï¼ä½ å¯è½è¿æ¯æå¾å¤ççæï¼åæ¬ Chart æ¯å¦ä½çæååå¸çï¼å¦ä½åå»ºä¸ä¸ªæ°ç Chartï¼å¨è¿èæç¨ä¸­ï¼æä»¬ä¼å°è¯èªå·±æ¥åå»º hello-helm Chart æ¥å®æä¹åçæä½ã

é¦åå»ºè®®ä½¿ç¨ `helm create` å½ä»¤æ¥åå»ºä¸ä¸ªåå§ç Chartï¼è¯¥å½ä»¤é»è®¤ä¼åå»ºä¸äº k8s èµæºå®ä¹çåå§æä»¶ï¼å¹¶ä¸ä¼çæå®ç½æ¨èçç®å½ç»æï¼å¦ä¸æç¤ºï¼

```shell
helm create hello-helm

.
âââ Chart.yaml
âââ charts
âââ templates
âÂ Â  âââ NOTES.txt
âÂ Â  âââ _helpers.tpl
âÂ Â  âââ deployment.yaml
âÂ Â  âââ hpa.yaml
âÂ Â  âââ ingress.yaml
âÂ Â  âââ service.yaml
âÂ Â  âââ serviceaccount.yaml
âÂ Â  âââ tests
âÂ Â      âââ test-connection.yaml
âââ values.yaml
```

æä»¬å°é»è®¤çæå¨ templates ç®å½ä¸é¢ç `yaml` æä»¶å é¤ï¼ç¨ä¹åæç¨ä¸­ `yaml` æä»¶æ¿æ¢å®ï¼æç»çç»æé¿è¿æ ·ï¼

```shell
.
âââ Chart.yaml
âââ Dockerfile
âââ _helpers.tpl
âââ charts
âââ hello-helm-0.1.0.tgz
âââ index.yaml
âââ main.go
âââ templates
âÂ Â  âââ hellok8s-configmaps.yaml
âÂ Â  âââ hellok8s-deployment.yaml
âÂ Â  âââ hellok8s-secret.yaml
âÂ Â  âââ hellok8s-service.yaml
âÂ Â  âââ ingress.yaml
âÂ Â  âââ nginx-deployment.yaml
âÂ Â  âââ nginx-service.yaml
âââ values.yaml
```

å¶ä¸­ `main.go` å®ä¹çæ¯ `hellok8s:v6` çæ¬çä»£ç ï¼ä¸»è¦æ¯ä»ç³»ç»ä¸­æ¿å° messageï¼namespaceï¼dbURLï¼dbPassword è¿å ä¸ªç¯å¢åéï¼æ¼æ¥æå­ç¬¦ä¸²è¿åã

```go
package main

import (
	"fmt"
	"io"
	"net/http"
	"os"
)

func hello(w http.ResponseWriter, r *http.Request) {
	host, _ := os.Hostname()
	message := os.Getenv("MESSAGE")
	namespace := os.Getenv("NAMESPACE")
	dbURL := os.Getenv("DB_URL")
	dbPassword := os.Getenv("DB_PASSWORD")

	io.WriteString(w, fmt.Sprintf("[v6] Hello, Helm! Message from helm values: %s, From namespace: %s, From host: %s, Get Database Connect URL: %s, Database Connect Password: %s", message, namespace, host, dbURL, dbPassword))
}

func main() {
	http.HandleFunc("/", hello)
	http.ListenAndServe(":3000", nil)
}
```

ä¸ºäºè®©å¤§å®¶æ´å äºè§£ helm charts values çä½¿ç¨åçæ k8s èµæºéç½®ï¼è¿å ä¸ªç¯å¢åé `MESSAGE`, `NAMESPACE`, `DB_URL`, `DB_PASSWORD` åå«æä¸åçæ¥æºã

é¦åä¿®æ¹æ ¹ç®å½ä¸ç `values.yaml` æä»¶ï¼å®ä¹èªå®ä¹çéç½®ä¿¡æ¯ï¼ä»ä¹åæç¨ç k8s èµæºæä»¶ä¸­ï¼å°ä¸äºæäºååçåæ°æååºæ¥ï¼æ¾å¨ `values.yaml` æä»¶ä¸­ãå¨é¨éç½®ä¿¡æ¯å¦ä¸æç¤ºï¼

```yaml
application:
  name: hellok8s
  hellok8s:
    image: guangzhengli/hellok8s:v6
    replicas: 3
    message: "It works with Helm Values!"
    database:
      url: "http://DB_ADDRESS_DEFAULT"
      password: "db_password"
  nginx:
    image: nginx
    replicas: 2
```

é£èªå®ä¹å¥½äºè¿äºéç½®åï¼å¦ä½å¨ k8s èµæºå®ä¹ä¸­ä½¿ç¨è¿äºéç½®ä¿¡æ¯å¢ï¼Helm é»è®¤ä½¿ç¨ [Go template çæ¹å¼](https://helm.sh/zh/docs/howto/charts_tips_and_tricks/) æ¥å®æã

ä¾å¦ä¹åæç¨ä¸­ï¼å°ç¯å¢åé `DB_URL` å®ä¹å¨ k8s configmaps ä¸­ï¼é£ä¹è¯¥èµæºå¯ä»¥å®ä¹æå¦æä»¶æç¤º `hellok8s-configmaps.yaml`ãå¶ä¸­ `metadata.name` çå¼æ¯ `{{ .Values.application.name }}-config`ï¼æææ¯ä» `values.yaml` æä»¶ä¸­è·å `application.name` çå¼ `hellok8s`ï¼æ¼æ¥ `-config` å­ç¬¦ä¸²ï¼è¿æ ·åå»ºåºæ¥ç configmaps èµæºåç§°å°±æ¯ `hellok8s-config`ã

åç `{{ .Values.application.hellok8s.database.url }}` å°±æ¯è·åå¼ä¸º  `http://DB_ADDRESS_DEFAULT`  æ¾å¥ configmaps å¯¹åº key ä¸º DB_URL ç value ä¸­ã

```yaml
apiVersion: v1
kind: ConfigMap
metadata:
  name: {{ .Values.application.name }}-config
data:
  DB_URL: {{ .Values.application.hellok8s.database.url }}
```

ä¸é¢å®ä¹çæç»ææåä¹åå¨ `configmaps` æç¨ä¸­å®ä¹çèµæºæ²¡æåºå«ï¼è¿ç§åçå¥½å¤æ¯å¯ä»¥å°ææå¯åçåæ°å®ä¹å¨ `values.yaml` æä»¶ä¸­ï¼ä½¿ç¨è¯¥ helm charts çäººæ éäºè§£å·ä½ k8s çå®ä¹ï¼åªéæ¹åæèªå·±æ³è¦çåæ°ï¼å³å¯åå»ºèªå®ä¹çèµæºï¼

åæ ·ï¼æä»¬å¯ä»¥æ ¹æ®ä¹åçæç¨å° `DB_PASSWORD` æ¾å¥ secret ä¸­ï¼å¹¶ä¸éè¿ `b64enc` æ¹æ³å°å¼ Base64 ç¼ç ã

```shell
# hellok8s-secret.yaml
apiVersion: v1
kind: Secret
metadata:
  name: {{ .Values.application.name }}-secret
data:
  DB_PASSWORD: {{ .Values.application.hellok8s.database.password | b64enc }}
```

æåï¼ä¿®æ¹ `hellok8s-deployment` æä»¶ï¼æ ¹æ®åé¢çæç¨ï¼å° `metadata.name` `replicas` `image`  `configMapKeyRef.name` `secretKeyRef.name` ç­å¼ä¿®æ¹æä» `values.yaml` æä»¶ä¸­è·åã

åæ·»å ä»£ç ä¸­éè¦ç `NAMESPACE` ç¯å¢åéï¼ä» `.Release.Namespace` [åç½®å¯¹è±¡](https://helm.sh/zh/docs/chart_template_guide/builtin_objects/) ä¸­è·åãæåæ·»å  `MESSAGE` ç¯å¢åéï¼ç´æ¥ä» `{{ .Values.application.hellok8s.message }}` ä¸­è·åã

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: {{ .Values.application.name }}-deployment
spec:
  replicas: {{ .Values.application.hellok8s.replicas }}
  selector:
    matchLabels:
      app: hellok8s
  template:
    metadata:
      labels:
        app: hellok8s
    spec:
      containers:
        - image: {{ .Values.application.hellok8s.image }}
          name: hellok8s-container
          env:
            - name: DB_URL
              valueFrom:
                configMapKeyRef:
                  name: {{ .Values.application.name }}-config
                  key: DB_URL
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: {{ .Values.application.name }}-secret
                  key: DB_PASSWORD
            - name: NAMESPACE
              value: {{ .Release.Namespace }}
            - name: MESSAGE
              value: {{ .Values.application.hellok8s.message }}
```

ä¿®æ¹  `ingress.yaml` å° `metadata.name` çå¼ï¼å¶å®æ²¡æåå

``` yaml
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata:
  name: {{ .Values.application.name }}-ingress
...
...
...
```

`nginx-deployment.yaml`

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-deployment
spec:
  replicas: {{ .Values.application.nginx.replicas }}
  selector:
    matchLabels:
      app: nginx
  template:
    metadata:
      labels:
        app: nginx
    spec:
      containers:
      - image: {{ .Values.application.nginx.image }}
        name: nginx-container
```

`nginx-service.yaml` å `hellok8s-service.yaml` æ²¡æååãææä»£ç å¯ä»¥å¨ [è¿é](https://github.com/guangzhengli/k8s-tutorials/tree/main/helm-charts/hello-helm) æ¥çã

ç¨å¾®ä¿®æ¹ä¸é»è®¤çæç`Chart.yaml`

```yaml
apiVersion: v2
name: hello-helm
description: A k8s tutorials in https://github.com/guangzhengli/k8s-tutorials
type: application
version: 0.1.0
appVersion: "1.16.0"
```

å®ä¹å®æææç helm èµæºåï¼é¦å**å° `hellok8s:v6` éåæåæ¨éå° DockerHub**ã

ä¹åå³å¯å¨ `hello-helm` çç®å½ä¸æ§è¡ `helm upgrade` å½ä»¤è¿è¡å®è£ï¼å®è£æååï¼æ§è¡ curl å½ä»¤ä¾¿è½ç´æ¥å¾å°ç»æï¼æ¥ç pod å service ç­èµæºï¼ä¾¿ä¼åç° helm è½ä¸é®å®è£ææèµæºï¼

```shell
helm upgrade --install hello-helm --values values.yaml .
# Release "hello-helm" does not exist. Installing it now.
# NAME: hello-helm
# NAMESPACE: default
# STATUS: deployed
# REVISION: 1

curl http://192.168.59.100/hello
# [v6] Hello, Helm! Message from helm values: It works with Helm Values!, From namespace: default, From host: hellok8s-deployment-57d7df7964-m6gcc, Get Database Connect URL: http://DB_ADDRESS_DEFAULT, Database Connect Password: db_password

kubectl get pods
# NAME                                  READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-f88f984c6-k8hpz   1/1     Running   0          32m
# hellok8s-deployment-f88f984c6-nzwg6   1/1     Running   0          32m
# hellok8s-deployment-f88f984c6-s89s7   1/1     Running   0          32m
# nginx-deployment-d47fd7f66-6w76b      1/1     Running   0          32m
# nginx-deployment-d47fd7f66-tsqj5      1/1     Running   0          32m
```

#### rollback

Helm ä¹æä¾äº Rollback çåè½ï¼æä»¬åä¿®æ¹ä¸ä¸ `message: "It works with Helm Values[v2]!"` å ä¸ [v2]ã

```
application:
  name: hellok8s
  hellok8s:
    image: guangzhengli/hellok8s:v6
    replicas: 3
    message: "It works with Helm Values[v2]!"
    database:
      url: "http://DB_ADDRESS_DEFAULT"
      password: "db_password"
  nginx:
    image: nginx
    replicas: 2
```

åæ§è¡ `helm upgrade` å½ä»¤æ´æ° k8s èµæºï¼éè¿ `curl http://192.168.59.100/hello` å¯ä»¥çå°èµæºå·²ç»æ´æ°ã

```shell
â  hello-helm git:(main) â helm upgrade --install hello-helm --values values.yaml .
# Release "hello-helm" has been upgraded. Happy Helming!
NAME: hello-helm
NAMESPACE: default
STATUS: deployed
REVISION: 2

curl http://192.168.59.100/hello
# [v6] Hello, Helm! Message from helm values: It works with Helm Values[v2]!, From namespace: default, From host: hellok8s-deployment-598bbd6884-4b9bw, Get Database Connect URL: http://DB_ADDRESS_DEFAULT, Database Connect Password: db_password
```

å¦æè¿ä¸æ¬¡æ´æ°æé®é¢çè¯ï¼å¯ä»¥éè¿ ` helm rollback` å¿«éåæ»ãéè¿ä¸é¢å½ä»¤çå°ï¼å deployment ç rollback ä¸æ ·ï¼åæ»å REVISION çæ¬é½ä¼å¢å¤§å° 3 èä¸æ¯åæ»å° 1ï¼åæ»åä½¿ç¨  `curl` å½ä»¤è¿åç v1 çæ¬çå­ç¬¦ä¸²ã

```shell
helm ls
# NAME            NAMESPACE       REVISION          STATUS          CHART                   APP VERSION
# hello-helm      default         2                 deployed        hello-helm-0.1.0        1.16.0 

helm rollback hello-helm 1
# Rollback was a success! Happy Helming!

helm ls
# NAME            NAMESPACE       REVISION          STATUS          CHART                   APP VERSION
# hello-helm      default         3                 deployed        hello-helm-0.1.0        1.16.0 

curl http://192.168.59.100/hello
# [v6] Hello, Helm! Message from helm values: It works with Helm Values!, From namespace: default, From host: hellok8s-deployment-57d7df7964-482xw, Get Database Connect URL: http://DB_ADDRESS_DEFAULT, Database Connect Password: db_password
```

#### å¤ç¯å¢éç½®

ä½¿ç¨ Helm ä¹å¾å®¹æå¤ç¯å¢é¨ç½²ï¼æ°å»º `values-dev.yaml` æä»¶ï¼éé¢åå®¹èªå®ä¹ `dev` ç¯å¢éè¦çéç½®ä¿¡æ¯ã

```yaml
application:
  hellok8s:
    message: "It works with Helm Values values-dev.yaml!"
    database:
      url: "http://DB_ADDRESS_DEV"
      password: "db_password_dev"
```

å¯ä»¥å¤æ¬¡æå®'--values -f'åæ°ï¼æåï¼æå³è¾¹ï¼æå®çæä»¶ä¼åçº§æé«ï¼è¿éæå³è¾¹çæ¯ `values-dev.yaml` æä»¶ï¼æä»¥ `values-dev.yaml` æä»¶ä¸­çå¼ä¼è¦ç `values.yaml` ä¸­ç¸åçå¼ï¼`-n dev` è¡¨ç¤ºå¨åå­ä¸º dev ç namespace ä¸­åå»º k8s èµæºï¼æ§è¡å®æåï¼æä»¬å¯ä»¥éè¿ `curl` å½ä»¤çå°è¿åçå­ç¬¦ä¸²ä¸­è¯»åçæ¯ `values-dev.yaml` æä»¶çéç½®ï¼å¹¶ä¸ `From namespace = dev`ã

```shell
helm upgrade --install hello-helm -f values.yaml -f values-dev.yaml -n dev .

# Release "hello-helm" does not exist. Installing it now.
# NAME: hello-helm
# NAMESPACE: dev
# STATUS: deployed
# REVISION: 1

curl http://192.168.59.100/hello
# [v6] Hello, Helm! Message from helm values: It works with Helm Values values-dev.yaml!, From namespace: dev, From host: hellok8s-deployment-f5fff9df-89sn6, Get Database Connect URL: http://DB_ADDRESS_DEV, Database Connect Password: db_password_dev

kubectl get pods -n dev
# NAME                                 READY   STATUS    RESTARTS   AGE
# hellok8s-deployment-f5fff9df-89sn6   1/1     Running   0          4m23s
# hellok8s-deployment-f5fff9df-tkh6g   1/1     Running   0          4m23s
# hellok8s-deployment-f5fff9df-wmlpb   1/1     Running   0          4m23s
# nginx-deployment-d47fd7f66-cdlmf     1/1     Running   0          4m23s
# nginx-deployment-d47fd7f66-cgst2     1/1     Running   0          4m23s
```

é¤æ­¤ä¹å¤ï¼è¿å¯ä»¥ä½¿ç¨ '--set-file' è®¾ç½®ç¬ç«çå¼ï¼ç±»ä¼¼äº `helm upgrade --install hello-helm -f values.yaml -f values-dev.yaml --set application.hellok8s.message="It works with set helm values" -n dev .` æ¹å¼å¨å½ä»¤ä¸­è®¾ç½® values çå¼ï¼å¯ä»¥éæä¿®æ¹ç¸å³éç½®ï¼æ­¤æ¹æ³å¨ CICD ä¸­ç»å¸¸ç¨å°ã

### helm chart æåååå¸

ä¸é¢çä¾å­å±ç¤ºäºæä»¬å¯ä»¥ç¨ä¸è¡å½ä»¤å¨ä¸ä¸ªæ°çç¯å¢ä¸­å®è£ææéè¦ç k8s èµæºï¼é£ä¹å¦ä½å° helm chart æåãåååä¸è½½å¢ï¼å¨å®ç½ä¸­ï¼æä¾äºä¸¤ç§æç¨ï¼ä¸ç§æ¯ä»¥ [GCS å­å¨çæç¨](https://helm.sh/zh/docs/howto/chart_repository_sync_example/)ï¼è¿æä¸ç§æ¯ä»¥ [GitHub Pages å­å¨çæç¨](https://helm.sh/zh/docs/howto/chart_releaser_action/)ã

è¿éæä»¬ä½¿ç¨ç¬¬äºç§ï¼å¹¶ä¸ä½¿ç¨ [chart-releaser-action](https://github.com/helm/chart-releaser-action) æ¥åèªå¨åå¸ï¼è¯¥ action ä¼é»è®¤çæ helm chart åå¸å° `gh-pages` åæ¯ä¸ï¼æ¬æç¨ç hellok8s helm chart å°±åå¸å¨äºæ¬ä»åºç[gh-pages](https://github.com/guangzhengli/k8s-tutorials/tree/gh-pages/) åæ¯ä¸ç `index.yaml` æä»¶ä¸­ã


å¨ä½¿ç¨ action èªå¨çæ chart ä¹åï¼æä»¬å¯ä»¥åçæä¸ä¸å¦ä½æå¨çæï¼å¨ `hello-helm` ç®å½ä¸ï¼æ§è¡ `helm package` å°chartç®å½æåå°chartå½æ¡£ä¸­ã`helm repo index` å½ä»¤å¯ä»¥åºäºåå«æåchartçç®å½ï¼çæä»åºçç´¢å¼æä»¶ `index.yaml`ã

æåï¼å¯ä»¥ä½¿ç¨ `helm upgrade --install *.tgz` å½ä»¤å°è¯¥æå®åè¿è¡å®è£ä½¿ç¨ã

```shell
helm package hello-helm
# Successfully packaged chart and saved it to: /Users/guangzheng.li/workspace/k8s-tutorials/hello-helm/hello-helm-0.1.0.tgz

helm repo index .

helm upgrade --install hello-helm hello-helm-0.1.0.tgz
```

åºäºä¸é¢çæ­¥éª¤ï¼ä½ å¯è½å·²ç»æ³å°ï¼æè°ç helm æåååå¸ï¼å°±æ¯ `hello-helm-0.1.0.tgz` æä»¶å `index.yaml` çæåä¸ä¼ çä¸ä¸ªè¿ç¨ãè helm ä¸è½½åå®è£ï¼å°±æ¯å¦ä½å° `.tgz` å `index.yaml` æä»¶ä¸è½½å `helm upgrade --install` çè¿ç¨ã

æ¥ä¸æ¥æä»¬åå¸çæç hellok8s helm chartï¼åå°æå¨çæç `hello-helm-0.1.0.tgz` å `index.yaml` æä»¶å é¤ï¼åç»­ä½¿ç¨ GitHub action èªå¨çæååå¸è¿ä¸¤ä¸ªæä»¶ã

GitHub action çä»£ç å¯ä»¥åè [å®ç½ææ¡£](https://helm.sh/zh/docs/howto/chart_releaser_action/) æèæ¬ä»åº `.github/workflows/release.yml` æä»¶ãä»£è¡¨å½ push ä»£ç å°è¿ç¨ä»åºæ¶ï¼å° `helm-charts` ç®å½ä¸çææ charts èªå¨æåååå¸å° `gh-pages` åæ¯å»(éè¦ä¿è¯ `gh-pages` åæ¯å·²ç»å­å¨ï¼å¦åä¼æ¥é)ã


```yaml
name: Release Charts

on:
  push:
    branches:
      - main

jobs:
  release:
    # depending on default permission settings for your org (contents being read-only or read-write for workloads), you will have to add permissions
    # see: https://docs.github.com/en/actions/security-guides/automatic-token-authentication#modifying-the-permissions-for-the-github_token
    permissions:
      contents: write
    runs-on: ubuntu-latest
    steps:
      - name: Checkout
        uses: actions/checkout@v2
        with:
          fetch-depth: 0

      - name: Configure Git
        run: |
          git config user.name "$GITHUB_ACTOR"
          git config user.email "$GITHUB_ACTOR@users.noreply.github.com"

      - name: Install Helm
        uses: azure/setup-helm@v1
        with:
          version: v3.8.1

      - name: Run chart-releaser
        uses: helm/chart-releaser-action@v1.4.0
        with: 
          charts_dir: helm-charts
        env:
          CR_TOKEN: "${{ secrets.GITHUB_TOKEN }}"
```

æ¥çéç½®ä»åºç `Settings -> Pages -> Build and deployment -> Branch`ï¼éæ© `gh-pages` åæ¯ï¼GitHub ä¼èªå¨å¨ `https://username.github.io/project` åå¸ helm chartã

æåï¼ä½ å¯ä»¥å°èªå·±ç helm charts åå¸å°ç¤¾åºä¸­å»ï¼å¯ä»¥èèåå¸å° [ArtifactHub](https://artifacthub.io/) ä¸­ï¼åæ¬ä»åºçæç helm charts å³åå¸å¨ [ArtifactHub hellok8s](https://artifacthub.io/packages/helm/hellok8s/hello-helm) ä¸­ã

![tnvYFS](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/tnvYFS.png)

## Dashboard

### kubernetes dashboard

> Dashboard æ¯åºäºç½é¡µç Kubernetes ç¨æ·çé¢ã ä½ å¯ä»¥ä½¿ç¨ Dashboard å°å®¹å¨åºç¨é¨ç½²å° Kubernetes éç¾¤ä¸­ï¼ä¹å¯ä»¥å¯¹å®¹å¨åºç¨æéï¼è¿è½ç®¡çéç¾¤èµæºã ä½ å¯ä»¥ä½¿ç¨ Dashboard è·åè¿è¡å¨éç¾¤ä¸­çåºç¨çæ¦è§ä¿¡æ¯ï¼ä¹å¯ä»¥åå»ºæèä¿®æ¹ Kubernetes èµæº ï¼å¦ Deploymentï¼Jobï¼DaemonSet ç­ç­ï¼ã ä¾å¦ï¼ä½ å¯ä»¥å¯¹ Deployment å®ç°å¼¹æ§ä¼¸ç¼©ãåèµ·æ»å¨åçº§ãéå¯ Pod æèä½¿ç¨åå¯¼åå»ºæ°çåºç¨ã

å¨æ¬å° minikube ç¯å¢ï¼å¯ä»¥ç´æ¥éè¿ä¸é¢å½ä»¤å¼å¯ Dashboardãæ´å¤ç¨æ³å¯ä»¥åèå®ç½æèèªè¡æ¢ç´¢ã

```shell
minikube dashboard
```

![eB3MYd](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/eB3MYd.png)

### K9s

[K9s](https://k9scli.io/) æ¯ä¸ä¸ªåºäº Terminal çè½»éçº§ UIï¼å¯ä»¥æ´å è½»æ¾çè§å¯åç®¡çå·²é¨ç½²ç k8s èµæºãä½¿ç¨æ¹å¼éå¸¸ç®åï¼å®è£åè¾å¥ `k9s` å³å¯å¼å¯ Terminal Dashboardï¼æ´å¤ç¨æ³å¯ä»¥åèå®ç½ã

![83ybd4](https://cdn.jsdelivr.net/gh/guangzhengli/PicURL@master/uPic/83ybd4.png)

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=guangzhengli/k8s-tutorials&type=Date)](https://star-history.com/#guangzhengli/k8s-tutorials&Date)
package com.tencent.wxcloudrun.model.VO;

public class NewsVO {
        private String avatar;
        private String topic;
        private long timestamp;
        private String content;

        // 构造函数
        public NewsVO(String avatar, String topic, long timestamp, String content) {
            this.avatar = avatar;
            this.topic = topic;
            this.timestamp = timestamp;
            this.content = content;
        }

        // Getter 和 Setter 方法
        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }



}
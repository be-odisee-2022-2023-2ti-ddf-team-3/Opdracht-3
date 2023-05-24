<template>
    <button class="button" @click="back()">← back</button>
    <div v-for="demo in  demos ">
        <div v-if="demo.id == id">
            <h2>{{ demo.naam }}</h2>
            <table>
                <tr>
                    <td>id:</td>
                    <td>{{ demo.id }}</td>
                </tr>
                <tr>
                    <td>email:</td>
                    <td>{{ demo.adres }}</td>
                </tr>
                <tr>
                    <td>paswoord:</td>
                    <td>{{ demo.status }}</td>
                </tr>
            </table>

            <button class="button eddit_button">eddit</button>
            <button class="button delete_button">delete</button>
        </div>
    </div>
</template>

<script>
import router from "../router";

export default {
    props: ['id'],
    data() {
        return {
            demos: [
                {
                    "id": 1,
                    "naam": "Odisee Demo",
                    "adres": "Stormstraat 2, 1000 Brussel",
                    "status": "aangemaakt"
                },
                {
                    "id": 2,
                    "naam": "Odisee Demo",
                    "adres": "Stormstraat 2, 1000 Brussel",
                    "status": "aangemaakt"
                },
                {
                    "id": 3,
                    "naam": "Odisee Demo",
                    "adres": "Stormstraat 2, 1000 Brussel",
                    "status": "aangemaakt"
                },
                {
                    "id": 4,
                    "naam": "Odisee Demo",
                    "adres": "Stormstraat 2, 1000 Brussel",
                    "status": "aangemaakt"
                }
            ]
        };
    },
    methods: {
        back() {
            router.go(-1)
        }
    }
}
</script>
<style scoped>
table td {
    padding: 5px 15px;
}

.back_button {
    background-color: gray;

}

.eddit_button {
    background-color: #0E86D4;
    color: #fff;
}

.delete_button {
    background-color: #d74451;
    color: #fff;

}

.button {
    padding: 6px 12px;
    border: none;
    border-radius: 4px;
}
</style>
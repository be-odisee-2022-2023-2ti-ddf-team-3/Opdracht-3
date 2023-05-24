<template>
    <button class="button" @click="back()">← back</button>
    <div v-for="p in person">
        <h2>{{ p.voornaam }} {{ p.familienaam }}</h2>
        <table>
            <tr>
                <td>id:</td>
                <td>{{ p.id }}</td>
            </tr>
            <tr>
                <td>email:</td>
                <td>{{ p.emailadres }}</td>
            </tr>
            <tr>
                <td>paswoord:</td>
                <td>{{ p.paswoord }}</td>
            </tr>
            <tr>
                <td>rol:</td>
                <td>{{ p.rol }}</td>
            </tr>
        </table>
        <button class="button eddit_button">eddit</button>
        <button class="button delete_button">delete</button>
    </div>
</template>

<script>
import router from "../router";

export default {
    props: ['id'],
    data() {
        return {
            person: [
                {
                    "id": 1,
                    "voornaam": "Thomas",
                    "familienaam": "Roelandts",
                    "emailadres": "roelandts.th@gmail.com",
                    "paswoord": "geheim",
                    "rol": "Admin"
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
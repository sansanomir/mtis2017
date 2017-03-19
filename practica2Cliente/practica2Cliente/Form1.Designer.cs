namespace practica2Cliente
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.textBoxReferencia = new System.Windows.Forms.TextBox();
            this.textBoxUnidades = new System.Windows.Forms.TextBox();
            this.labelReferencia = new System.Windows.Forms.Label();
            this.labelUnidades = new System.Windows.Forms.Label();
            this.labelResultado = new System.Windows.Forms.Label();
            this.buttonComprobar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // textBoxReferencia
            // 
            this.textBoxReferencia.Location = new System.Drawing.Point(145, 60);
            this.textBoxReferencia.Name = "textBoxReferencia";
            this.textBoxReferencia.Size = new System.Drawing.Size(100, 20);
            this.textBoxReferencia.TabIndex = 0;
            // 
            // textBoxUnidades
            // 
            this.textBoxUnidades.Location = new System.Drawing.Point(145, 115);
            this.textBoxUnidades.Name = "textBoxUnidades";
            this.textBoxUnidades.Size = new System.Drawing.Size(100, 20);
            this.textBoxUnidades.TabIndex = 1;
            // 
            // labelReferencia
            // 
            this.labelReferencia.AutoSize = true;
            this.labelReferencia.Location = new System.Drawing.Point(145, 41);
            this.labelReferencia.Name = "labelReferencia";
            this.labelReferencia.Size = new System.Drawing.Size(62, 13);
            this.labelReferencia.TabIndex = 2;
            this.labelReferencia.Text = "Referencia:";
            // 
            // labelUnidades
            // 
            this.labelUnidades.AutoSize = true;
            this.labelUnidades.Location = new System.Drawing.Point(145, 96);
            this.labelUnidades.Name = "labelUnidades";
            this.labelUnidades.Size = new System.Drawing.Size(55, 13);
            this.labelUnidades.TabIndex = 3;
            this.labelUnidades.Text = "Unidades:";
            // 
            // labelResultado
            // 
            this.labelResultado.AutoSize = true;
            this.labelResultado.Location = new System.Drawing.Point(165, 182);
            this.labelResultado.Name = "labelResultado";
            this.labelResultado.Size = new System.Drawing.Size(58, 13);
            this.labelResultado.TabIndex = 4;
            this.labelResultado.Text = "Resultado:";
            // 
            // buttonComprobar
            // 
            this.buttonComprobar.Location = new System.Drawing.Point(157, 156);
            this.buttonComprobar.Name = "buttonComprobar";
            this.buttonComprobar.Size = new System.Drawing.Size(75, 23);
            this.buttonComprobar.TabIndex = 5;
            this.buttonComprobar.Text = "Comprar";
            this.buttonComprobar.UseVisualStyleBackColor = true;
            this.buttonComprobar.Click += new System.EventHandler(this.buttonComprobar_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(455, 368);
            this.Controls.Add(this.buttonComprobar);
            this.Controls.Add(this.labelResultado);
            this.Controls.Add(this.labelUnidades);
            this.Controls.Add(this.labelReferencia);
            this.Controls.Add(this.textBoxUnidades);
            this.Controls.Add(this.textBoxReferencia);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBoxReferencia;
        private System.Windows.Forms.TextBox textBoxUnidades;
        private System.Windows.Forms.Label labelReferencia;
        private System.Windows.Forms.Label labelUnidades;
        private System.Windows.Forms.Label labelResultado;
        private System.Windows.Forms.Button buttonComprobar;
    }
}


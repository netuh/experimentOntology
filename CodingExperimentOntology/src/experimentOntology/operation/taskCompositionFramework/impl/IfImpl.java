/**
 */
package experimentOntology.operation.taskCompositionFramework.impl;

import experimentOntology.operation.taskCompositionFramework.ElseIf;
import experimentOntology.operation.taskCompositionFramework.If;
import experimentOntology.operation.taskCompositionFramework.Task;
import experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.impl.IfImpl#getElseif <em>Elseif</em>}</li>
 *   <li>{@link experimentOntology.operation.taskCompositionFramework.impl.IfImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends TaskImpl implements If {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElseif() <em>Elseif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseif()
	 * @generated
	 * @ordered
	 */
	protected ElseIf elseif;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskCompositionFrameworkPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskCompositionFrameworkPackage.IF__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIf getElseif() {
		return elseif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseif(ElseIf newElseif, NotificationChain msgs) {
		ElseIf oldElseif = elseif;
		elseif = newElseif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskCompositionFrameworkPackage.IF__ELSEIF, oldElseif, newElseif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseif(ElseIf newElseif) {
		if (newElseif != elseif) {
			NotificationChain msgs = null;
			if (elseif != null)
				msgs = ((InternalEObject)elseif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskCompositionFrameworkPackage.IF__ELSEIF, null, msgs);
			if (newElseif != null)
				msgs = ((InternalEObject)newElseif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskCompositionFrameworkPackage.IF__ELSEIF, null, msgs);
			msgs = basicSetElseif(newElseif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskCompositionFrameworkPackage.IF__ELSEIF, newElseif, newElseif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskCompositionFrameworkPackage.IF__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskCompositionFrameworkPackage.IF__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskCompositionFrameworkPackage.IF__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskCompositionFrameworkPackage.IF__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskCompositionFrameworkPackage.IF__ELSEIF:
				return basicSetElseif(null, msgs);
			case TaskCompositionFrameworkPackage.IF__TASK:
				return basicSetTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskCompositionFrameworkPackage.IF__CONDITION:
				return getCondition();
			case TaskCompositionFrameworkPackage.IF__ELSEIF:
				return getElseif();
			case TaskCompositionFrameworkPackage.IF__TASK:
				return getTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskCompositionFrameworkPackage.IF__CONDITION:
				setCondition((String)newValue);
				return;
			case TaskCompositionFrameworkPackage.IF__ELSEIF:
				setElseif((ElseIf)newValue);
				return;
			case TaskCompositionFrameworkPackage.IF__TASK:
				setTask((Task)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaskCompositionFrameworkPackage.IF__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case TaskCompositionFrameworkPackage.IF__ELSEIF:
				setElseif((ElseIf)null);
				return;
			case TaskCompositionFrameworkPackage.IF__TASK:
				setTask((Task)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaskCompositionFrameworkPackage.IF__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case TaskCompositionFrameworkPackage.IF__ELSEIF:
				return elseif != null;
			case TaskCompositionFrameworkPackage.IF__TASK:
				return task != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //IfImpl

/**
 */
package experimentOntology.operation.impl;

import experimentOntology.operation.OperationPackage;
import experimentOntology.operation.PreExecutionPlan;
import experimentOntology.operation.PreTasks;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.operation.impl.PreExecutionPlanImpl#getPretasks <em>Pretasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreExecutionPlanImpl extends MinimalEObjectImpl.Container implements PreExecutionPlan {
	/**
	 * The cached value of the '{@link #getPretasks() <em>Pretasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPretasks()
	 * @generated
	 * @ordered
	 */
	protected PreTasks pretasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreExecutionPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationPackage.Literals.PRE_EXECUTION_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreTasks getPretasks() {
		return pretasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPretasks(PreTasks newPretasks, NotificationChain msgs) {
		PreTasks oldPretasks = pretasks;
		pretasks = newPretasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationPackage.PRE_EXECUTION_PLAN__PRETASKS, oldPretasks, newPretasks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPretasks(PreTasks newPretasks) {
		if (newPretasks != pretasks) {
			NotificationChain msgs = null;
			if (pretasks != null)
				msgs = ((InternalEObject)pretasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationPackage.PRE_EXECUTION_PLAN__PRETASKS, null, msgs);
			if (newPretasks != null)
				msgs = ((InternalEObject)newPretasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationPackage.PRE_EXECUTION_PLAN__PRETASKS, null, msgs);
			msgs = basicSetPretasks(newPretasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationPackage.PRE_EXECUTION_PLAN__PRETASKS, newPretasks, newPretasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationPackage.PRE_EXECUTION_PLAN__PRETASKS:
				return basicSetPretasks(null, msgs);
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
			case OperationPackage.PRE_EXECUTION_PLAN__PRETASKS:
				return getPretasks();
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
			case OperationPackage.PRE_EXECUTION_PLAN__PRETASKS:
				setPretasks((PreTasks)newValue);
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
			case OperationPackage.PRE_EXECUTION_PLAN__PRETASKS:
				setPretasks((PreTasks)null);
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
			case OperationPackage.PRE_EXECUTION_PLAN__PRETASKS:
				return pretasks != null;
		}
		return super.eIsSet(featureID);
	}

} //PreExecutionPlanImpl

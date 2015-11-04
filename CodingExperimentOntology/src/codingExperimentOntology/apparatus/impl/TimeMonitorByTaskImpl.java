/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.apparatus.NewPackage4Package;
import codingExperimentOntology.apparatus.TaskRelated;
import codingExperimentOntology.apparatus.TimeMonitorByTask;

import codingExperimentOntology.tasks.CodingTask;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Monitor By Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.impl.TimeMonitorByTaskImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeMonitorByTaskImpl extends TimeMonitorInstrumentImpl implements TimeMonitorByTask {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<CodingTask> task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeMonitorByTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage4Package.Literals.TIME_MONITOR_BY_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodingTask> getTask() {
		if (task == null) {
			task = new EObjectResolvingEList<CodingTask>(CodingTask.class, this, NewPackage4Package.TIME_MONITOR_BY_TASK__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage4Package.TIME_MONITOR_BY_TASK__TASK:
				return getTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage4Package.TIME_MONITOR_BY_TASK__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends CodingTask>)newValue);
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
			case NewPackage4Package.TIME_MONITOR_BY_TASK__TASK:
				getTask().clear();
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
			case NewPackage4Package.TIME_MONITOR_BY_TASK__TASK:
				return task != null && !task.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TaskRelated.class) {
			switch (derivedFeatureID) {
				case NewPackage4Package.TIME_MONITOR_BY_TASK__TASK: return NewPackage4Package.TASK_RELATED__TASK;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TaskRelated.class) {
			switch (baseFeatureID) {
				case NewPackage4Package.TASK_RELATED__TASK: return NewPackage4Package.TIME_MONITOR_BY_TASK__TASK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TimeMonitorByTaskImpl
